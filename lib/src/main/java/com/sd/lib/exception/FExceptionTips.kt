package com.sd.lib.exception

/**
 * 提示异常
 */
open class FExceptionTips @JvmOverloads constructor(
    message: String?,
    cause: Throwable? = null,
) : FException(message, cause)

@JvmOverloads
fun fError(
    message: String,
    cause: Throwable? = null,
): Nothing {
    throw FExceptionTips(
        message = message,
        cause = cause,
    )
}
