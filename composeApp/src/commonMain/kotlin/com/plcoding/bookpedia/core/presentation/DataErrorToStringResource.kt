package com.plcoding.bookpedia.core.presentation

import cmp_bookpedia.composeapp.generated.resources.Res
import cmp_bookpedia.composeapp.generated.resources.disk_full_error
import cmp_bookpedia.composeapp.generated.resources.no_internet_error
import cmp_bookpedia.composeapp.generated.resources.request_timeout_error
import cmp_bookpedia.composeapp.generated.resources.too_many_requests_error
import cmp_bookpedia.composeapp.generated.resources.unknown_error
import com.plcoding.bookpedia.core.domain.DataError

fun DataError.toUiText(): UiText {
    val stringResource = when (this) {
        DataError.Local.DISK_FULL -> Res.string.disk_full_error
        DataError.Remote.REQUEST_TIMEOUT -> Res.string.request_timeout_error
        DataError.Remote.TOO_MANY_REQUESTS -> Res.string.too_many_requests_error
        DataError.Remote.NO_INTERNET -> Res.string.no_internet_error
        else -> Res.string.unknown_error
    }

    return UiText.StringResourceId(stringResource)
}