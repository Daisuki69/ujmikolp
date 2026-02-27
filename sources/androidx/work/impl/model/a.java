package androidx.work.impl.model;

import java.util.HashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RawWorkInfoDao_Impl f8249b;

    public /* synthetic */ a(RawWorkInfoDao_Impl rawWorkInfoDao_Impl, int i) {
        this.f8248a = i;
        this.f8249b = rawWorkInfoDao_Impl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f8248a) {
            case 0:
                return this.f8249b.lambda$__fetchRelationshipWorkTagAsjavaLangString$0((HashMap) obj);
            default:
                return this.f8249b.lambda$__fetchRelationshipWorkProgressAsandroidxWorkData$1((HashMap) obj);
        }
    }
}
