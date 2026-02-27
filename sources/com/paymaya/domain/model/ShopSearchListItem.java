package com.paymaya.domain.model;

import jj.InterfaceC1685a;
import k2.v0;

/* JADX INFO: loaded from: classes4.dex */
public interface ShopSearchListItem {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class VIEW_TYPE {
        private static final /* synthetic */ InterfaceC1685a $ENTRIES;
        private static final /* synthetic */ VIEW_TYPE[] $VALUES;
        private final int value;
        public static final VIEW_TYPE VIEW_TYPE_PRODUCT = new VIEW_TYPE("VIEW_TYPE_PRODUCT", 0, 0);
        public static final VIEW_TYPE VIEW_TYPE_LOADING = new VIEW_TYPE("VIEW_TYPE_LOADING", 1, 1);

        private static final /* synthetic */ VIEW_TYPE[] $values() {
            return new VIEW_TYPE[]{VIEW_TYPE_PRODUCT, VIEW_TYPE_LOADING};
        }

        static {
            VIEW_TYPE[] view_typeArr$values = $values();
            $VALUES = view_typeArr$values;
            $ENTRIES = v0.h(view_typeArr$values);
        }

        private VIEW_TYPE(String str, int i, int i4) {
            this.value = i4;
        }

        public static InterfaceC1685a getEntries() {
            return $ENTRIES;
        }

        public static VIEW_TYPE valueOf(String str) {
            return (VIEW_TYPE) Enum.valueOf(VIEW_TYPE.class, str);
        }

        public static VIEW_TYPE[] values() {
            return (VIEW_TYPE[]) $VALUES.clone();
        }

        public final int getValue() {
            return this.value;
        }
    }

    VIEW_TYPE getViewType();
}
