package com.sd.lib.exception

/**
 * 状态码异常
 */
open class FExceptionCode @JvmOverloads constructor(
    val code: Int,
    message: String? = null,
    cause: Throwable? = null,
) : FException(message, cause) {

    override val formatMessage: String
        get() {
            val msg = super.formatMessage ?: ""
            return "${msg}(${code})"
        }
}