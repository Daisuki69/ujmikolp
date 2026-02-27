package com.paymaya.domain.model;

import java.util.Locale;
import jj.InterfaceC1685a;
import k2.v0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class MayaCreditCardAccountStatus {
    private static final /* synthetic */ InterfaceC1685a $ENTRIES;
    private static final /* synthetic */ MayaCreditCardAccountStatus[] $VALUES;
    public static final Companion Companion;
    public static final MayaCreditCardAccountStatus ACTIVE = new MayaCreditCardAccountStatus("ACTIVE", 0);
    public static final MayaCreditCardAccountStatus OTHERS = new MayaCreditCardAccountStatus("OTHERS", 1);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final MayaCreditCardAccountStatus from(String str) {
            String upperCase;
            if (str != null) {
                upperCase = str.toUpperCase(Locale.ROOT);
                j.f(upperCase, "toUpperCase(...)");
            } else {
                upperCase = null;
            }
            return j.b(upperCase, "ACTIVE") ? MayaCreditCardAccountStatus.ACTIVE : MayaCreditCardAccountStatus.OTHERS;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ MayaCreditCardAccountStatus[] $values() {
        return new MayaCreditCardAccountStatus[]{ACTIVE, OTHERS};
    }

    static {
        MayaCreditCardAccountStatus[] mayaCreditCardAccountStatusArr$values = $values();
        $VALUES = mayaCreditCardAccountStatusArr$values;
        $ENTRIES = v0.h(mayaCreditCardAccountStatusArr$values);
        Companion = new Companion(null);
    }

    private MayaCreditCardAccountStatus(String str, int i) {
    }

    public static InterfaceC1685a getEntries() {
        return $ENTRIES;
    }

    public static MayaCreditCardAccountStatus valueOf(String str) {
        return (MayaCreditCardAccountStatus) Enum.valueOf(MayaCreditCardAccountStatus.class, str);
    }

    public static MayaCreditCardAccountStatus[] values() {
        return (MayaCreditCardAccountStatus[]) $VALUES.clone();
    }
}
