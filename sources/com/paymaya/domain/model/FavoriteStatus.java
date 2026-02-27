package com.paymaya.domain.model;

import jj.InterfaceC1685a;
import k2.v0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class FavoriteStatus {
    private static final /* synthetic */ InterfaceC1685a $ENTRIES;
    private static final /* synthetic */ FavoriteStatus[] $VALUES;
    public static final FavoriteStatus FAVORITE_NOT_CREATED = new FavoriteStatus("FAVORITE_NOT_CREATED", 0);
    public static final FavoriteStatus FAVORITE_CREATE_SUCCESS = new FavoriteStatus("FAVORITE_CREATE_SUCCESS", 1);
    public static final FavoriteStatus FAVORITE_CREATE_FAILURE = new FavoriteStatus("FAVORITE_CREATE_FAILURE", 2);
    public static final FavoriteStatus FAVORITE_NO_UPDATE = new FavoriteStatus("FAVORITE_NO_UPDATE", 3);
    public static final FavoriteStatus FAVORITE_UPDATE_SUCCESS = new FavoriteStatus("FAVORITE_UPDATE_SUCCESS", 4);
    public static final FavoriteStatus FAVORITE_UPDATE_FAILURE = new FavoriteStatus("FAVORITE_UPDATE_FAILURE", 5);
    public static final FavoriteStatus FAVORITE_UNSPECIFIED = new FavoriteStatus("FAVORITE_UNSPECIFIED", 6);

    private static final /* synthetic */ FavoriteStatus[] $values() {
        return new FavoriteStatus[]{FAVORITE_NOT_CREATED, FAVORITE_CREATE_SUCCESS, FAVORITE_CREATE_FAILURE, FAVORITE_NO_UPDATE, FAVORITE_UPDATE_SUCCESS, FAVORITE_UPDATE_FAILURE, FAVORITE_UNSPECIFIED};
    }

    static {
        FavoriteStatus[] favoriteStatusArr$values = $values();
        $VALUES = favoriteStatusArr$values;
        $ENTRIES = v0.h(favoriteStatusArr$values);
    }

    private FavoriteStatus(String str, int i) {
    }

    public static InterfaceC1685a getEntries() {
        return $ENTRIES;
    }

    public static FavoriteStatus valueOf(String str) {
        return (FavoriteStatus) Enum.valueOf(FavoriteStatus.class, str);
    }

    public static FavoriteStatus[] values() {
        return (FavoriteStatus[]) $VALUES.clone();
    }
}
