package androidx.window.layout.adapter.sidecar;

import androidx.window.sidecar.SidecarDisplayFeature;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;

/* JADX INFO: loaded from: classes2.dex */
public final class SidecarAdapter$translate$checkedFeature$1 extends k implements Function1<SidecarDisplayFeature, Boolean> {
    public static final SidecarAdapter$translate$checkedFeature$1 INSTANCE = new SidecarAdapter$translate$checkedFeature$1();

    public SidecarAdapter$translate$checkedFeature$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(SidecarDisplayFeature require) {
        j.g(require, "$this$require");
        boolean z4 = true;
        if (require.getType() != 1 && require.getType() != 2) {
            z4 = false;
        }
        return Boolean.valueOf(z4);
    }
}
