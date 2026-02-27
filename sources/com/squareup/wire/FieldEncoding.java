package com.squareup.wire;

import We.s;
import java.io.IOException;
import java.net.ProtocolException;
import jj.InterfaceC1685a;
import k2.v0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class FieldEncoding {
    private static final /* synthetic */ InterfaceC1685a $ENTRIES;
    private static final /* synthetic */ FieldEncoding[] $VALUES;
    public static final Companion Companion;
    private final int value;
    public static final FieldEncoding VARINT = new FieldEncoding("VARINT", 0, 0);
    public static final FieldEncoding FIXED64 = new FieldEncoding("FIXED64", 1, 1);
    public static final FieldEncoding LENGTH_DELIMITED = new FieldEncoding("LENGTH_DELIMITED", 2, 2);
    public static final FieldEncoding FIXED32 = new FieldEncoding("FIXED32", 3, 5);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final FieldEncoding get$wire_runtime(int i) throws IOException {
            if (i == 0) {
                return FieldEncoding.VARINT;
            }
            if (i == 1) {
                return FieldEncoding.FIXED64;
            }
            if (i == 2) {
                return FieldEncoding.LENGTH_DELIMITED;
            }
            if (i == 5) {
                return FieldEncoding.FIXED32;
            }
            throw new ProtocolException(s.f(i, "Unexpected FieldEncoding: "));
        }

        private Companion() {
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FieldEncoding.values().length];
            try {
                iArr[FieldEncoding.VARINT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FieldEncoding.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FieldEncoding.FIXED64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FieldEncoding.LENGTH_DELIMITED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ FieldEncoding[] $values() {
        return new FieldEncoding[]{VARINT, FIXED64, LENGTH_DELIMITED, FIXED32};
    }

    static {
        FieldEncoding[] fieldEncodingArr$values = $values();
        $VALUES = fieldEncodingArr$values;
        $ENTRIES = v0.h(fieldEncodingArr$values);
        Companion = new Companion(null);
    }

    private FieldEncoding(String str, int i, int i4) {
        this.value = i4;
    }

    public static InterfaceC1685a getEntries() {
        return $ENTRIES;
    }

    public static FieldEncoding valueOf(String str) {
        return (FieldEncoding) Enum.valueOf(FieldEncoding.class, str);
    }

    public static FieldEncoding[] values() {
        return (FieldEncoding[]) $VALUES.clone();
    }

    public final int getValue$wire_runtime() {
        return this.value;
    }

    public final ProtoAdapter<?> rawProtoAdapter() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return ProtoAdapter.UINT64;
        }
        if (i == 2) {
            return ProtoAdapter.FIXED32;
        }
        if (i == 3) {
            return ProtoAdapter.FIXED64;
        }
        if (i == 4) {
            return ProtoAdapter.BYTES;
        }
        throw new NoWhenBranchMatchedException();
    }
}
