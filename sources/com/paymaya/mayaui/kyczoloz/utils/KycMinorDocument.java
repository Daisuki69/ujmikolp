package com.paymaya.mayaui.kyczoloz.utils;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public abstract class KycMinorDocument implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12431a;

    public static final class BirthCertificateKycDocument extends KycMinorDocument {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final BirthCertificateKycDocument f12432b = new BirthCertificateKycDocument("birth_certificate");
        public static final Parcelable.Creator<BirthCertificateKycDocument> CREATOR = new a();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            j.g(dest, "dest");
            dest.writeInt(1);
        }
    }

    public static final class ConsentFormKycDocument extends KycMinorDocument {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final ConsentFormKycDocument f12433b = new ConsentFormKycDocument("consent_form");
        public static final Parcelable.Creator<ConsentFormKycDocument> CREATOR = new b();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            j.g(dest, "dest");
            dest.writeInt(1);
        }
    }

    public static final class ParentIdKycDocument extends KycMinorDocument {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final ParentIdKycDocument f12434b = new ParentIdKycDocument("parent_id");
        public static final Parcelable.Creator<ParentIdKycDocument> CREATOR = new c();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            j.g(dest, "dest");
            dest.writeInt(1);
        }
    }

    public KycMinorDocument(String str) {
        this.f12431a = str;
    }
}
