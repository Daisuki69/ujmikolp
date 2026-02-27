package com.paymaya.domain.model;

import jj.InterfaceC1685a;
import k2.v0;

/* JADX INFO: loaded from: classes4.dex */
public interface MissionsV2ListItem {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class VIEW_TYPE_MISSION_V2 {
        private static final /* synthetic */ InterfaceC1685a $ENTRIES;
        private static final /* synthetic */ VIEW_TYPE_MISSION_V2[] $VALUES;
        private final int value;
        public static final VIEW_TYPE_MISSION_V2 VIEW_TYPE_LOADING = new VIEW_TYPE_MISSION_V2("VIEW_TYPE_LOADING", 0, 0);
        public static final VIEW_TYPE_MISSION_V2 VIEW_TYPE_MISSION_NOT_STARTED = new VIEW_TYPE_MISSION_V2("VIEW_TYPE_MISSION_NOT_STARTED", 1, 1);
        public static final VIEW_TYPE_MISSION_V2 VIEW_TYPE_MISSION_IN_PROGRESS = new VIEW_TYPE_MISSION_V2("VIEW_TYPE_MISSION_IN_PROGRESS", 2, 2);
        public static final VIEW_TYPE_MISSION_V2 VIEW_TYPE_MISSION_COMPLETED = new VIEW_TYPE_MISSION_V2("VIEW_TYPE_MISSION_COMPLETED", 3, 3);

        private static final /* synthetic */ VIEW_TYPE_MISSION_V2[] $values() {
            return new VIEW_TYPE_MISSION_V2[]{VIEW_TYPE_LOADING, VIEW_TYPE_MISSION_NOT_STARTED, VIEW_TYPE_MISSION_IN_PROGRESS, VIEW_TYPE_MISSION_COMPLETED};
        }

        static {
            VIEW_TYPE_MISSION_V2[] view_type_mission_v2Arr$values = $values();
            $VALUES = view_type_mission_v2Arr$values;
            $ENTRIES = v0.h(view_type_mission_v2Arr$values);
        }

        private VIEW_TYPE_MISSION_V2(String str, int i, int i4) {
            this.value = i4;
        }

        public static InterfaceC1685a getEntries() {
            return $ENTRIES;
        }

        public static VIEW_TYPE_MISSION_V2 valueOf(String str) {
            return (VIEW_TYPE_MISSION_V2) Enum.valueOf(VIEW_TYPE_MISSION_V2.class, str);
        }

        public static VIEW_TYPE_MISSION_V2[] values() {
            return (VIEW_TYPE_MISSION_V2[]) $VALUES.clone();
        }

        public final int getValue() {
            return this.value;
        }
    }

    VIEW_TYPE_MISSION_V2 getViewTypeMissionV2();
}
