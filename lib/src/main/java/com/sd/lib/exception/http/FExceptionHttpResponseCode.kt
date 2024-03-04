package com.sd.lib.exception.http

import com.sd.lib.ctx.fContext
import com.sd.lib.exception.R

/**
 * Http返回码异常
 */
class FExceptionHttpResponseCode @JvmOverloads constructor(
    val code: Int,
    message: String? = null,
) : FExceptionHttp(message = message) {

    override val formatMessage: String
        get() {
            super.formatMessage?.let { return it }
            val localMsg = fContext.getString(R.string.lib_exception_http_message_response_code)
            return "${localMsg}(${code})"
        }
}