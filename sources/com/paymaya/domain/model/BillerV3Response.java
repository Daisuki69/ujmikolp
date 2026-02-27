package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.datasource.cache.c;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.domain.model.Biller;
import defpackage.AbstractC1414e;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class BillerV3Response implements Parcelable {
    public static final Parcelable.Creator<BillerV3Response> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.ACTIVE)
    private final Boolean active;

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.TAG_METADATA)
    private final BillerMetadata billerMetadata;

    @InterfaceC1497a
    @InterfaceC1498b("category")
    private final String category;

    @InterfaceC1497a
    @InterfaceC1498b("categorySlug")
    private final String categorySlug;

    @InterfaceC1497a
    @InterfaceC1498b("confirmationUrl")
    private final ImageUrlUnfiltered confirmationUrl;

    @InterfaceC1497a
    @InterfaceC1498b("iconUrl")
    private final ImageUrlUnfiltered iconUrl;

    @InterfaceC1497a
    @InterfaceC1498b("listUrl")
    private final ImageUrlUnfiltered listUrl;

    @InterfaceC1497a
    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String name;

    @InterfaceC1497a
    @InterfaceC1498b("otherFields")
    private final List<UIComponent> otherFields;

    @InterfaceC1497a
    @InterfaceC1498b("paymentMethods")
    private final List<String> paymentMethods;

    @InterfaceC1497a
    @InterfaceC1498b("slug")
    private final String slug;

    public static final class Creator implements Parcelable.Creator<BillerV3Response> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BillerV3Response createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            BillerMetadata billerMetadata = (BillerMetadata) parcel.readParcelable(BillerV3Response.class.getClassLoader());
            ArrayList arrayList = null;
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            ImageUrlUnfiltered imageUrlUnfiltered = (ImageUrlUnfiltered) parcel.readParcelable(BillerV3Response.class.getClassLoader());
            ImageUrlUnfiltered imageUrlUnfiltered2 = (ImageUrlUnfiltered) parcel.readParcelable(BillerV3Response.class.getClassLoader());
            ImageUrlUnfiltered imageUrlUnfiltered3 = (ImageUrlUnfiltered) parcel.readParcelable(BillerV3Response.class.getClassLoader());
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i4 = 0; i4 != i; i4++) {
                    arrayList2.add(parcel.readParcelable(BillerV3Response.class.getClassLoader()));
                }
                arrayList = arrayList2;
            }
            return new BillerV3Response(string, string2, string3, string4, billerMetadata, boolValueOf, imageUrlUnfiltered, imageUrlUnfiltered2, imageUrlUnfiltered3, arrayList, parcel.createStringArrayList());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BillerV3Response[] newArray(int i) {
            return new BillerV3Response[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BillerV3Response(String str, String slug, String str2, String str3, BillerMetadata billerMetadata, Boolean bool, ImageUrlUnfiltered imageUrlUnfiltered, ImageUrlUnfiltered imageUrlUnfiltered2, ImageUrlUnfiltered imageUrlUnfiltered3, List<? extends UIComponent> list, List<String> list2) {
        j.g(slug, "slug");
        this.name = str;
        this.slug = slug;
        this.category = str2;
        this.categorySlug = str3;
        this.billerMetadata = billerMetadata;
        this.active = bool;
        this.confirmationUrl = imageUrlUnfiltered;
        this.iconUrl = imageUrlUnfiltered2;
        this.listUrl = imageUrlUnfiltered3;
        this.otherFields = list;
        this.paymentMethods = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BillerV3Response copy$default(BillerV3Response billerV3Response, String str, String str2, String str3, String str4, BillerMetadata billerMetadata, Boolean bool, ImageUrlUnfiltered imageUrlUnfiltered, ImageUrlUnfiltered imageUrlUnfiltered2, ImageUrlUnfiltered imageUrlUnfiltered3, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = billerV3Response.name;
        }
        if ((i & 2) != 0) {
            str2 = billerV3Response.slug;
        }
        if ((i & 4) != 0) {
            str3 = billerV3Response.category;
        }
        if ((i & 8) != 0) {
            str4 = billerV3Response.categorySlug;
        }
        if ((i & 16) != 0) {
            billerMetadata = billerV3Response.billerMetadata;
        }
        if ((i & 32) != 0) {
            bool = billerV3Response.active;
        }
        if ((i & 64) != 0) {
            imageUrlUnfiltered = billerV3Response.confirmationUrl;
        }
        if ((i & 128) != 0) {
            imageUrlUnfiltered2 = billerV3Response.iconUrl;
        }
        if ((i & 256) != 0) {
            imageUrlUnfiltered3 = billerV3Response.listUrl;
        }
        if ((i & 512) != 0) {
            list = billerV3Response.otherFields;
        }
        if ((i & 1024) != 0) {
            list2 = billerV3Response.paymentMethods;
        }
        List list3 = list;
        List list4 = list2;
        ImageUrlUnfiltered imageUrlUnfiltered4 = imageUrlUnfiltered2;
        ImageUrlUnfiltered imageUrlUnfiltered5 = imageUrlUnfiltered3;
        Boolean bool2 = bool;
        ImageUrlUnfiltered imageUrlUnfiltered6 = imageUrlUnfiltered;
        BillerMetadata billerMetadata2 = billerMetadata;
        String str5 = str3;
        return billerV3Response.copy(str, str2, str5, str4, billerMetadata2, bool2, imageUrlUnfiltered6, imageUrlUnfiltered4, imageUrlUnfiltered5, list3, list4);
    }

    public final String component1() {
        return this.name;
    }

    public final List<UIComponent> component10() {
        return this.otherFields;
    }

    public final List<String> component11() {
        return this.paymentMethods;
    }

    public final String component2() {
        return this.slug;
    }

    public final String component3() {
        return this.category;
    }

    public final String component4() {
        return this.categorySlug;
    }

    public final BillerMetadata component5() {
        return this.billerMetadata;
    }

    public final Boolean component6() {
        return this.active;
    }

    public final ImageUrlUnfiltered component7() {
        return this.confirmationUrl;
    }

    public final ImageUrlUnfiltered component8() {
        return this.iconUrl;
    }

    public final ImageUrlUnfiltered component9() {
        return this.listUrl;
    }

    public final Biller convertToBiller() {
        Biller.Builder builderMActive = Biller.sBuilder().mName(this.name).mSlug(this.slug).mCategory(this.category).mCategorySlug(this.categorySlug).mMetadata(this.billerMetadata).mActive(this.active);
        ImageUrlUnfiltered imageUrlUnfiltered = this.confirmationUrl;
        Biller.Builder builderMConfirmationUrl = builderMActive.mConfirmationUrl(imageUrlUnfiltered != null ? imageUrlUnfiltered.mAndroidImageUrl() : null);
        ImageUrlUnfiltered imageUrlUnfiltered2 = this.iconUrl;
        Biller.Builder builderMIconUrl = builderMConfirmationUrl.mIconUrl(imageUrlUnfiltered2 != null ? imageUrlUnfiltered2.mAndroidImageUrl() : null);
        ImageUrlUnfiltered imageUrlUnfiltered3 = this.listUrl;
        Biller billerBuild = builderMIconUrl.mListUrl(imageUrlUnfiltered3 != null ? imageUrlUnfiltered3.mAndroidImageUrl() : null).mOtherFields(this.otherFields).mPaymentMethod(this.paymentMethods).build();
        j.f(billerBuild, "build(...)");
        return billerBuild;
    }

    public final BillerDetails convertToBillerDetails() {
        BillerDetails billerDetailsBuild = BillerDetails.sBuilder().mName(this.name).mSlug(this.slug).mCategory(this.category).mCategorySlug(this.categorySlug).mMetadata(this.billerMetadata).mActive(this.active).mConfirmationUrl(this.confirmationUrl).mIconUrl(this.iconUrl).mListUrl(this.listUrl).mOtherFields(this.otherFields).build();
        j.f(billerDetailsBuild, "build(...)");
        return billerDetailsBuild;
    }

    public final BillerV3Response copy(String str, String slug, String str2, String str3, BillerMetadata billerMetadata, Boolean bool, ImageUrlUnfiltered imageUrlUnfiltered, ImageUrlUnfiltered imageUrlUnfiltered2, ImageUrlUnfiltered imageUrlUnfiltered3, List<? extends UIComponent> list, List<String> list2) {
        j.g(slug, "slug");
        return new BillerV3Response(str, slug, str2, str3, billerMetadata, bool, imageUrlUnfiltered, imageUrlUnfiltered2, imageUrlUnfiltered3, list, list2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BillerV3Response)) {
            return false;
        }
        BillerV3Response billerV3Response = (BillerV3Response) obj;
        return j.b(this.name, billerV3Response.name) && j.b(this.slug, billerV3Response.slug) && j.b(this.category, billerV3Response.category) && j.b(this.categorySlug, billerV3Response.categorySlug) && j.b(this.billerMetadata, billerV3Response.billerMetadata) && j.b(this.active, billerV3Response.active) && j.b(this.confirmationUrl, billerV3Response.confirmationUrl) && j.b(this.iconUrl, billerV3Response.iconUrl) && j.b(this.listUrl, billerV3Response.listUrl) && j.b(this.otherFields, billerV3Response.otherFields) && j.b(this.paymentMethods, billerV3Response.paymentMethods);
    }

    public final Boolean getActive() {
        return this.active;
    }

    public final BillerMetadata getBillerMetadata() {
        return this.billerMetadata;
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getCategorySlug() {
        return this.categorySlug;
    }

    public final ImageUrlUnfiltered getConfirmationUrl() {
        return this.confirmationUrl;
    }

    public final ImageUrlUnfiltered getIconUrl() {
        return this.iconUrl;
    }

    public final ImageUrlUnfiltered getListUrl() {
        return this.listUrl;
    }

    public final String getName() {
        return this.name;
    }

    public final List<UIComponent> getOtherFields() {
        return this.otherFields;
    }

    public final List<String> getPaymentMethods() {
        return this.paymentMethods;
    }

    public final String getSlug() {
        return this.slug;
    }

    public int hashCode() {
        String str = this.name;
        int iC = AbstractC1414e.c((str == null ? 0 : str.hashCode()) * 31, 31, this.slug);
        String str2 = this.category;
        int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.categorySlug;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        BillerMetadata billerMetadata = this.billerMetadata;
        int iHashCode3 = (iHashCode2 + (billerMetadata == null ? 0 : billerMetadata.hashCode())) * 31;
        Boolean bool = this.active;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        ImageUrlUnfiltered imageUrlUnfiltered = this.confirmationUrl;
        int iHashCode5 = (iHashCode4 + (imageUrlUnfiltered == null ? 0 : imageUrlUnfiltered.hashCode())) * 31;
        ImageUrlUnfiltered imageUrlUnfiltered2 = this.iconUrl;
        int iHashCode6 = (iHashCode5 + (imageUrlUnfiltered2 == null ? 0 : imageUrlUnfiltered2.hashCode())) * 31;
        ImageUrlUnfiltered imageUrlUnfiltered3 = this.listUrl;
        int iHashCode7 = (iHashCode6 + (imageUrlUnfiltered3 == null ? 0 : imageUrlUnfiltered3.hashCode())) * 31;
        List<UIComponent> list = this.otherFields;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.paymentMethods;
        return iHashCode8 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        String str = this.name;
        String str2 = this.slug;
        String str3 = this.category;
        String str4 = this.categorySlug;
        BillerMetadata billerMetadata = this.billerMetadata;
        Boolean bool = this.active;
        ImageUrlUnfiltered imageUrlUnfiltered = this.confirmationUrl;
        ImageUrlUnfiltered imageUrlUnfiltered2 = this.iconUrl;
        ImageUrlUnfiltered imageUrlUnfiltered3 = this.listUrl;
        List<UIComponent> list = this.otherFields;
        List<String> list2 = this.paymentMethods;
        StringBuilder sbX = s.x("BillerV3Response(name=", str, ", slug=", str2, ", category=");
        c.A(sbX, str3, ", categorySlug=", str4, ", billerMetadata=");
        sbX.append(billerMetadata);
        sbX.append(", active=");
        sbX.append(bool);
        sbX.append(", confirmationUrl=");
        sbX.append(imageUrlUnfiltered);
        sbX.append(", iconUrl=");
        sbX.append(imageUrlUnfiltered2);
        sbX.append(", listUrl=");
        sbX.append(imageUrlUnfiltered3);
        sbX.append(", otherFields=");
        sbX.append(list);
        sbX.append(", paymentMethods=");
        return s.r(sbX, list2, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.name);
        dest.writeString(this.slug);
        dest.writeString(this.category);
        dest.writeString(this.categorySlug);
        dest.writeParcelable(this.billerMetadata, i);
        Boolean bool = this.active;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            AbstractC1213b.S(dest, 1, bool);
        }
        dest.writeParcelable(this.confirmationUrl, i);
        dest.writeParcelable(this.iconUrl, i);
        dest.writeParcelable(this.listUrl, i);
        List<UIComponent> list = this.otherFields;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itP = AbstractC1213b.P(dest, 1, list);
            while (itP.hasNext()) {
                dest.writeParcelable((Parcelable) itP.next(), i);
            }
        }
        dest.writeStringList(this.paymentMethods);
    }

    public /* synthetic */ BillerV3Response(String str, String str2, String str3, String str4, BillerMetadata billerMetadata, Boolean bool, ImageUrlUnfiltered imageUrlUnfiltered, ImageUrlUnfiltered imageUrlUnfiltered2, ImageUrlUnfiltered imageUrlUnfiltered3, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : billerMetadata, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : imageUrlUnfiltered, (i & 128) != 0 ? null : imageUrlUnfiltered2, (i & 256) != 0 ? null : imageUrlUnfiltered3, (i & 512) != 0 ? null : list, (i & 1024) != 0 ? null : list2);
    }
}
