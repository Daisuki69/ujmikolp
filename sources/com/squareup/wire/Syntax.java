package com.squareup.wire;

import jj.InterfaceC1685a;
import k2.v0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class Syntax {
    private static final /* synthetic */ InterfaceC1685a $ENTRIES;
    private static final /* synthetic */ Syntax[] $VALUES;
    public static final Companion Companion;
    public static final Syntax PROTO_2 = new Syntax("PROTO_2", 0, "proto2");
    public static final Syntax PROTO_3 = new Syntax("PROTO_3", 1, "proto3");
    private final String string;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Syntax get(String string) {
            j.g(string, "string");
            for (Syntax syntax : Syntax.values()) {
                if (j.b(syntax.string, string)) {
                    return syntax;
                }
            }
            throw new IllegalArgumentException("unexpected syntax: ".concat(string));
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ Syntax[] $values() {
        return new Syntax[]{PROTO_2, PROTO_3};
    }

    static {
        Syntax[] syntaxArr$values = $values();
        $VALUES = syntaxArr$values;
        $ENTRIES = v0.h(syntaxArr$values);
        Companion = new Companion(null);
    }

    private Syntax(String str, int i, String str2) {
        this.string = str2;
    }

    public static InterfaceC1685a getEntries() {
        return $ENTRIES;
    }

    public static Syntax valueOf(String str) {
        return (Syntax) Enum.valueOf(Syntax.class, str);
    }

    public static Syntax[] values() {
        return (Syntax[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.string;
    }
}
