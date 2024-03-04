package com.sd.lib.exception

import kotlin.coroutines.cancellation.CancellationException

open class FException @JvmOverloads constructor(
    message: String? = null,
    cause: Throwable? = null,
) : Exception(message, cause) {

    /** 异常描述 */
    val desc: String
        get() = buildString {
            val message = formatMessage ?: ""
            val cause = formatCause ?: ""

            append(message)
            if (message.isNotEmpty() && cause.isNotEmpty()) {
                append(" ")
            }
            append(cause)
        }

    /** 异常信息 */
    protected open val formatMessage: String?
        get() = localizedMessage

    /** 异常原因 */
    protected open val formatCause: String?
        get() = cause?.toString()

    override fun toString(): String {
        return desc
    }

    companion object {
        @JvmStatic
        fun wrap(throwable: Throwable): FException {
            return if (throwable is FException) throwable else FException(cause = throwable)
        }
    }
}

suspend inline fun <T> fCatchingAwait(block: suspend () -> T): Result<T> {
    return try {
        Result.success(block())
    } catch (e: Throwable) {
        if (e is CancellationException) throw e
        Result.failure(e)
    }
}