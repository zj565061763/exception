package com.sd.lib.exception.http

import com.sd.lib.exception.FException

/**
 * Http异常
 */
open class FExceptionHttp @JvmOverloads constructor(
    message: String? = null,
    cause: Throwable? = null,
) : FException(message, cause)