package com.dynatrace.android.api.compose;

import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.z;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes2.dex */
public final class SemanticsExtensionKt {
    static final /* synthetic */ KProperty[] $$delegatedProperties;
    private static final SemanticsPropertyKey<String> DtActionName;

    static {
        m mVar = new m(SemanticsExtensionKt.class, "dtActionName", "getDtActionName(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1);
        z.f18196a.getClass();
        $$delegatedProperties = new KProperty[]{mVar};
        DtActionName = new SemanticsPropertyKey<>("DtActionName", (Function2) null, 2, (DefaultConstructorMarker) null);
    }

    public static final SemanticsPropertyKey<String> getDtActionName() {
        return DtActionName;
    }

    public static final void setDtActionName(SemanticsPropertyReceiver semanticsPropertyReceiver, String str) {
        j.g(semanticsPropertyReceiver, "<this>");
        j.g(str, "<set-?>");
        DtActionName.setValue(semanticsPropertyReceiver, $$delegatedProperties[0], str);
    }

    public static final String getDtActionName(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        j.g(semanticsPropertyReceiver, "<this>");
        return (String) DtActionName.getValue(semanticsPropertyReceiver, $$delegatedProperties[0]);
    }
}
