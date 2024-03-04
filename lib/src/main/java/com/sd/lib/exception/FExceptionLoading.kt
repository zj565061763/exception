package com.sd.lib.exception

import com.sd.lib.ctx.fContext

/**
 * 加载中
 */
open class FExceptionLoading(
    message: String? = null,
) : FException(message) {
    override val formatMessage: String?
        get() {
            super.formatMessage?.let { return it }
            return fContext.getString(R.string.lib_exception_message_loading)
        }
}