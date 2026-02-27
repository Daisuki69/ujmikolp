package com.dynatrace.agent.userinteraction.handler;

import jj.InterfaceC1685a;
import k2.v0;

/* JADX INFO: loaded from: classes2.dex */
public interface UserInteractionHandler {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Type {
        private static final /* synthetic */ InterfaceC1685a $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type TOUCH = new Type("TOUCH", 0);

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{TOUCH};
        }

        static {
            Type[] typeArr$values = $values();
            $VALUES = typeArr$values;
            $ENTRIES = v0.h(typeArr$values);
        }

        private Type(String str, int i) {
        }

        public static InterfaceC1685a getEntries() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }
}
