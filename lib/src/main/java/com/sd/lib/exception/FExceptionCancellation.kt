package com.sd.lib.exception

/**
 * 取消
 */
open class FExceptionCancellation @JvmOverloads constructor(
    message: String? = null,
    cause: Throwable? = null,
) : FException(message, cause)