package com.paymaya.domain.model;

import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class FavoriteStatusKt {
    public static final boolean isFavoriteCreated(FavoriteStatus favoriteStatus) {
        j.g(favoriteStatus, "<this>");
        return (favoriteStatus == FavoriteStatus.FAVORITE_NOT_CREATED || favoriteStatus == FavoriteStatus.FAVORITE_CREATE_FAILURE) ? false : true;
    }

    public static final boolean isFavoriteStatusUpdate(FavoriteStatus favoriteStatus) {
        j.g(favoriteStatus, "<this>");
        return favoriteStatus == FavoriteStatus.FAVORITE_NO_UPDATE || favoriteStatus == FavoriteStatus.FAVORITE_UPDATE_SUCCESS || favoriteStatus == FavoriteStatus.FAVORITE_UPDATE_FAILURE;
    }
}
