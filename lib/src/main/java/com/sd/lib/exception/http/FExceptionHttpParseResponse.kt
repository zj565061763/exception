package com.sd.lib.exception.http

import com.sd.lib.ctx.fContext
import com.sd.lib.exception.R

/**
 * Http返回数据解析异常
 */
class FExceptionHttpParseResponse @JvmOverloads constructor(
    message: String? = null,
    cause: Throwable? = null,
) : FExceptionHttp(message, cause) {

    override val formatMessage: String
        get() {
            super.formatMessage?.let { return it }
            return fContext.getString(R.string.lib_exception_http_message_parse_response)
        }
}