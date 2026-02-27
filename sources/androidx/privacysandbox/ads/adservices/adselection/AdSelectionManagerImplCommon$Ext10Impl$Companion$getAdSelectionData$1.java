package androidx.privacysandbox.ads.adservices.adselection;

import androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon;
import gj.InterfaceC1526a;
import ij.AbstractC1609c;
import ij.InterfaceC1611e;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1611e(c = "androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion", f = "AdSelectionManagerImplCommon.kt", l = {231}, m = "getAdSelectionData")
public final class AdSelectionManagerImplCommon$Ext10Impl$Companion$getAdSelectionData$1 extends AbstractC1609c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AdSelectionManagerImplCommon.Ext10Impl.Companion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdSelectionManagerImplCommon$Ext10Impl$Companion$getAdSelectionData$1(AdSelectionManagerImplCommon.Ext10Impl.Companion companion, InterfaceC1526a<? super AdSelectionManagerImplCommon$Ext10Impl$Companion$getAdSelectionData$1> interfaceC1526a) {
        super(interfaceC1526a);
        this.this$0 = companion;
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getAdSelectionData(null, null, this);
    }
}
