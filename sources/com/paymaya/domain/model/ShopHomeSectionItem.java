package com.paymaya.domain.model;

import android.os.Parcelable;
import jj.InterfaceC1685a;
import k2.v0;

/* JADX INFO: loaded from: classes4.dex */
public interface ShopHomeSectionItem extends Parcelable {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class VIEW_TYPE {
        private static final /* synthetic */ InterfaceC1685a $ENTRIES;
        private static final /* synthetic */ VIEW_TYPE[] $VALUES;
        private final int value;
        public static final VIEW_TYPE VIEW_TYPE_SHOP_HOME_SECTION_CAROUSEL = new VIEW_TYPE("VIEW_TYPE_SHOP_HOME_SECTION_CAROUSEL", 0, 1);
        public static final VIEW_TYPE VIEW_TYPE_SHOP_HOME_SECTION_PROMOS_BANNER = new VIEW_TYPE("VIEW_TYPE_SHOP_HOME_SECTION_PROMOS_BANNER", 1, 2);
        public static final VIEW_TYPE VIEW_TYPE_SHOP_HOME_SECTION_LOAD_V2_BANNER = new VIEW_TYPE("VIEW_TYPE_SHOP_HOME_SECTION_LOAD_V2_BANNER", 2, 3);
        public static final VIEW_TYPE VIEW_TYPE_SHOP_HOME_SECTION_GAM_BANNER = new VIEW_TYPE("VIEW_TYPE_SHOP_HOME_SECTION_GAM_BANNER", 3, 4);

        private static final /* synthetic */ VIEW_TYPE[] $values() {
            return new VIEW_TYPE[]{VIEW_TYPE_SHOP_HOME_SECTION_CAROUSEL, VIEW_TYPE_SHOP_HOME_SECTION_PROMOS_BANNER, VIEW_TYPE_SHOP_HOME_SECTION_LOAD_V2_BANNER, VIEW_TYPE_SHOP_HOME_SECTION_GAM_BANNER};
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

    String getListType();

    String getName();

    int getPosition();

    VIEW_TYPE getViewType();

    void setListType(String str);

    void setName(String str);

    void setPosition(int i);
}
