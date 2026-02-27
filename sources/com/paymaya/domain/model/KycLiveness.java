package com.paymaya.domain.model;

import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class KycLiveness {

    @InterfaceC1497a
    @InterfaceC1498b(Constants.FILE)
    private final KycFileContent file;

    @InterfaceC1497a
    @InterfaceC1498b("parts")
    private final List<KycPart> parts;

    /* JADX WARN: Multi-variable type inference failed */
    public KycLiveness() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KycLiveness copy$default(KycLiveness kycLiveness, KycFileContent kycFileContent, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            kycFileContent = kycLiveness.file;
        }
        if ((i & 2) != 0) {
            list = kycLiveness.parts;
        }
        return kycLiveness.copy(kycFileContent, list);
    }

    public final KycFileContent component1() {
        return this.file;
    }

    public final List<KycPart> component2() {
        return this.parts;
    }

    public final KycLiveness copy(KycFileContent kycFileContent, List<KycPart> list) {
        return new KycLiveness(kycFileContent, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycLiveness)) {
            return false;
        }
        KycLiveness kycLiveness = (KycLiveness) obj;
        return j.b(this.file, kycLiveness.file) && j.b(this.parts, kycLiveness.parts);
    }

    public final KycFileContent getFile() {
        return this.file;
    }

    public final List<KycPart> getParts() {
        return this.parts;
    }

    public int hashCode() {
        KycFileContent kycFileContent = this.file;
        int iHashCode = (kycFileContent == null ? 0 : kycFileContent.hashCode()) * 31;
        List<KycPart> list = this.parts;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "KycLiveness(file=" + this.file + ", parts=" + this.parts + ")";
    }

    public KycLiveness(KycFileContent kycFileContent, List<KycPart> list) {
        this.file = kycFileContent;
        this.parts = list;
    }

    public /* synthetic */ KycLiveness(KycFileContent kycFileContent, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : kycFileContent, (i & 2) != 0 ? null : list);
    }
}
