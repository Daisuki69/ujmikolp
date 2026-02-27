package com.paymaya.domain.model;

import jj.InterfaceC1685a;
import k2.v0;

/* JADX INFO: loaded from: classes4.dex */
public interface ShopV3ProvidersCollectionItem {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ViewType {
        private static final /* synthetic */ InterfaceC1685a $ENTRIES;
        private static final /* synthetic */ ViewType[] $VALUES;
        public static final ViewType VIEW_TYPE_LOADING = new ViewType("VIEW_TYPE_LOADING", 0, -1);
        public static final ViewType VIEW_TYPE_PROVIDER = new ViewType("VIEW_TYPE_PROVIDER", 1, 0);
        private final int value;

        private static final /* synthetic */ ViewType[] $values() {
            return new ViewType[]{VIEW_TYPE_LOADING, VIEW_TYPE_PROVIDER};
        }

        static {
            ViewType[] viewTypeArr$values = $values();
            $VALUES = viewTypeArr$values;
            $ENTRIES = v0.h(viewTypeArr$values);
        }

        private ViewType(String str, int i, int i4) {
            this.value = i4;
        }

        public static InterfaceC1685a getEntries() {
            return $ENTRIES;
        }

        public static ViewType valueOf(String str) {
            return (ViewType) Enum.valueOf(ViewType.class, str);
        }

        public static ViewType[] values() {
            return (ViewType[]) $VALUES.clone();
        }

        public final int getValue() {
            return this.value;
        }
    }

    ViewType getViewTypeProvidersCollectionItem();
}
