package M8;

import android.content.Context;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import bg.AbstractC0971J0;
import bg.C0967H0;
import bg.C0968I;
import bg.C0969I0;
import bg.C0976O;
import bg.C0978Q;
import bg.C0980T;
import bg.C0981U;
import bg.C1005j;
import bg.C1008l;
import bg.C1013q;
import bg.EnumC0973L;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycAdditionalDocumentsFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycAmlcUploadDocumentsFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycChangeYourMindBottomSheetDialogFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycConfirmationBottomSheetDialogFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycDnfbpWhyNeededBottomSheetDialogFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycDocumentIdGuideFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycEverythingClearFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycIdReviewFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycMinorTakeAPhotoFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycPersonalInfoConfirmSubmissionFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycRestartBottomSheetDialogFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycSimpleCaptureV3Fragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycUploadPhilsysIdFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycWorkDetailsFragment;
import com.paymaya.mayaui.regv2.view.fragment.impl.MayaAccountProvisionFragment;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;
import zj.C2576A;

/* JADX INFO: renamed from: M8.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0376l extends kotlin.jvm.internal.k implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3330b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0376l(Object obj, int i) {
        super(0);
        this.f3329a = i;
        this.f3330b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object next;
        ConnectivityManager connectivityManagerI;
        switch (this.f3329a) {
            case 0:
                MayaKycAdditionalDocumentsFragment mayaKycAdditionalDocumentsFragment = (MayaKycAdditionalDocumentsFragment) this.f3330b;
                Bundle arguments = mayaKycAdditionalDocumentsFragment.getArguments();
                if (arguments != null) {
                    return arguments;
                }
                throw new IllegalStateException("Fragment " + mayaKycAdditionalDocumentsFragment + " has null arguments");
            case 1:
                MayaKycAmlcUploadDocumentsFragment mayaKycAmlcUploadDocumentsFragment = (MayaKycAmlcUploadDocumentsFragment) this.f3330b;
                Bundle arguments2 = mayaKycAmlcUploadDocumentsFragment.getArguments();
                if (arguments2 != null) {
                    return arguments2;
                }
                throw new IllegalStateException("Fragment " + mayaKycAmlcUploadDocumentsFragment + " has null arguments");
            case 2:
                MayaKycChangeYourMindBottomSheetDialogFragment mayaKycChangeYourMindBottomSheetDialogFragment = (MayaKycChangeYourMindBottomSheetDialogFragment) this.f3330b;
                Bundle arguments3 = mayaKycChangeYourMindBottomSheetDialogFragment.getArguments();
                if (arguments3 != null) {
                    return arguments3;
                }
                throw new IllegalStateException("Fragment " + mayaKycChangeYourMindBottomSheetDialogFragment + " has null arguments");
            case 3:
                MayaKycConfirmationBottomSheetDialogFragment mayaKycConfirmationBottomSheetDialogFragment = (MayaKycConfirmationBottomSheetDialogFragment) this.f3330b;
                Bundle arguments4 = mayaKycConfirmationBottomSheetDialogFragment.getArguments();
                if (arguments4 != null) {
                    return arguments4;
                }
                throw new IllegalStateException("Fragment " + mayaKycConfirmationBottomSheetDialogFragment + " has null arguments");
            case 4:
                MayaKycDnfbpWhyNeededBottomSheetDialogFragment mayaKycDnfbpWhyNeededBottomSheetDialogFragment = (MayaKycDnfbpWhyNeededBottomSheetDialogFragment) this.f3330b;
                Bundle arguments5 = mayaKycDnfbpWhyNeededBottomSheetDialogFragment.getArguments();
                if (arguments5 != null) {
                    return arguments5;
                }
                throw new IllegalStateException("Fragment " + mayaKycDnfbpWhyNeededBottomSheetDialogFragment + " has null arguments");
            case 5:
                MayaKycDocumentIdGuideFragment mayaKycDocumentIdGuideFragment = (MayaKycDocumentIdGuideFragment) this.f3330b;
                Bundle arguments6 = mayaKycDocumentIdGuideFragment.getArguments();
                if (arguments6 != null) {
                    return arguments6;
                }
                throw new IllegalStateException("Fragment " + mayaKycDocumentIdGuideFragment + " has null arguments");
            case 6:
                MayaKycEverythingClearFragment mayaKycEverythingClearFragment = (MayaKycEverythingClearFragment) this.f3330b;
                Bundle arguments7 = mayaKycEverythingClearFragment.getArguments();
                if (arguments7 != null) {
                    return arguments7;
                }
                throw new IllegalStateException("Fragment " + mayaKycEverythingClearFragment + " has null arguments");
            case 7:
                MayaKycIdReviewFragment mayaKycIdReviewFragment = (MayaKycIdReviewFragment) this.f3330b;
                Bundle arguments8 = mayaKycIdReviewFragment.getArguments();
                if (arguments8 != null) {
                    return arguments8;
                }
                throw new IllegalStateException("Fragment " + mayaKycIdReviewFragment + " has null arguments");
            case 8:
                MayaKycMinorTakeAPhotoFragment mayaKycMinorTakeAPhotoFragment = (MayaKycMinorTakeAPhotoFragment) this.f3330b;
                Bundle arguments9 = mayaKycMinorTakeAPhotoFragment.getArguments();
                if (arguments9 != null) {
                    return arguments9;
                }
                throw new IllegalStateException("Fragment " + mayaKycMinorTakeAPhotoFragment + " has null arguments");
            case 9:
                MayaKycPersonalInfoConfirmSubmissionFragment mayaKycPersonalInfoConfirmSubmissionFragment = (MayaKycPersonalInfoConfirmSubmissionFragment) this.f3330b;
                Bundle arguments10 = mayaKycPersonalInfoConfirmSubmissionFragment.getArguments();
                if (arguments10 != null) {
                    return arguments10;
                }
                throw new IllegalStateException("Fragment " + mayaKycPersonalInfoConfirmSubmissionFragment + " has null arguments");
            case 10:
                MayaKycRestartBottomSheetDialogFragment mayaKycRestartBottomSheetDialogFragment = (MayaKycRestartBottomSheetDialogFragment) this.f3330b;
                Bundle arguments11 = mayaKycRestartBottomSheetDialogFragment.getArguments();
                if (arguments11 != null) {
                    return arguments11;
                }
                throw new IllegalStateException("Fragment " + mayaKycRestartBottomSheetDialogFragment + " has null arguments");
            case 11:
                MayaKycSimpleCaptureV3Fragment mayaKycSimpleCaptureV3Fragment = (MayaKycSimpleCaptureV3Fragment) this.f3330b;
                Bundle arguments12 = mayaKycSimpleCaptureV3Fragment.getArguments();
                if (arguments12 != null) {
                    return arguments12;
                }
                throw new IllegalStateException("Fragment " + mayaKycSimpleCaptureV3Fragment + " has null arguments");
            case 12:
                MayaKycUploadPhilsysIdFragment mayaKycUploadPhilsysIdFragment = (MayaKycUploadPhilsysIdFragment) this.f3330b;
                Bundle arguments13 = mayaKycUploadPhilsysIdFragment.getArguments();
                if (arguments13 != null) {
                    return arguments13;
                }
                throw new IllegalStateException("Fragment " + mayaKycUploadPhilsysIdFragment + " has null arguments");
            case 13:
                MayaKycWorkDetailsFragment mayaKycWorkDetailsFragment = (MayaKycWorkDetailsFragment) this.f3330b;
                Bundle arguments14 = mayaKycWorkDetailsFragment.getArguments();
                if (arguments14 != null) {
                    return arguments14;
                }
                throw new IllegalStateException("Fragment " + mayaKycWorkDetailsFragment + " has null arguments");
            case 14:
                return ((Context) ((Y.e) this.f3330b).c).getPackageManager().getInstalledApplications(128);
            case 15:
                return androidx.webkit.internal.a.k(((C1008l) this.f3330b).c.getValue()).takeMyUidSnapshot();
            case 16:
                return (bg.u0) this.f3330b;
            case 17:
                StringBuilder sb2 = new StringBuilder();
                List<C0968I> list = C0976O.f8842d;
                ArrayList arrayList = new ArrayList(cj.t.l(list, 10));
                for (C0968I c0968i : list) {
                    C0976O c0976o = (C0976O) this.f3330b;
                    Context context = c0976o.f8844b;
                    c0968i.getClass();
                    kotlin.jvm.internal.v vVar = new kotlin.jvm.internal.v();
                    vVar.f18192a = 0.0f;
                    O4.k kVar = new O4.k(c0976o.c, 5);
                    ArrayList<AbstractC0971J0> arrayList2 = c0968i.f8813d;
                    for (AbstractC0971J0 abstractC0971J0 : arrayList2) {
                        abstractC0971J0.b(context, new C1005j(1, abstractC0971J0, vVar), kVar, sb2);
                    }
                    float f = vVar.f18192a;
                    String name = c0968i.f8811a;
                    kotlin.jvm.internal.j.h(name, "name");
                    arrayList.add(new C0968I(name, c0968i.f8812b, f, arrayList2));
                }
                Iterator it = arrayList.iterator();
                C0968I c0968i2 = null;
                if (it.hasNext()) {
                    next = it.next();
                    if (it.hasNext()) {
                        C0968I c0968i3 = (C0968I) next;
                        float f3 = c0968i3.c;
                        if (f3 < c0968i3.f8812b) {
                            f3 = Float.NEGATIVE_INFINITY;
                        }
                        do {
                            Object next2 = it.next();
                            C0968I c0968i4 = (C0968I) next2;
                            float f7 = c0968i4.c;
                            if (f7 < c0968i4.f8812b) {
                                f7 = Float.NEGATIVE_INFINITY;
                            }
                            if (Float.compare(f3, f7) < 0) {
                                next = next2;
                                f3 = f7;
                            }
                        } while (it.hasNext());
                    }
                } else {
                    next = null;
                }
                C0968I c0968i5 = (C0968I) next;
                if (c0968i5 != null && c0968i5.c >= c0968i5.f8812b) {
                    c0968i2 = c0968i5;
                }
                return c0968i2 != null ? new C0980T(c0968i2, sb2) : new C0981U(sb2);
            case 18:
                C0978Q c0978q = (C0978Q) this.f3330b;
                if (C0978Q.i(c0978q) == null || (connectivityManagerI = C0978Q.i(c0978q)) == null) {
                    return null;
                }
                ConnectivityManager connectivityManagerI2 = C0978Q.i(c0978q);
                return connectivityManagerI.getNetworkCapabilities(connectivityManagerI2 != null ? connectivityManagerI2.getActiveNetwork() : null);
            case 19:
                bg.o0 o0Var = (bg.o0) this.f3330b;
                o0Var.getClass();
                Xf.b bVar = o0Var.f9105b;
                Uri uri = ContactsContract.CommonDataKinds.Phone.CONTENT_URI;
                HashMap map = new HashMap();
                try {
                    Cursor cursorQuery = o0Var.f9104a.getContentResolver().query(uri, new String[]{"data1", "contact_id"}, null, null, null);
                    if (cursorQuery != null) {
                        cursorQuery.moveToFirst();
                        if (cursorQuery.getCount() > 0) {
                            do {
                                try {
                                    String string = cursorQuery.getString(cursorQuery.getColumnIndex("contact_id"));
                                    String string2 = cursorQuery.getString(cursorQuery.getColumnIndex("data1"));
                                    if (string2 != null && string2.length() != 0 && !map.containsKey(string2)) {
                                        map.put(string2, string);
                                    }
                                } catch (Exception e) {
                                    if (bVar != null) {
                                        bVar.b("Core", e, null);
                                    }
                                }
                            } while (cursorQuery.moveToNext());
                        }
                    }
                    break;
                } catch (Exception e7) {
                    if (!(e7 instanceof SecurityException) && bVar != null) {
                        bVar.b("Core", e7, null);
                    }
                }
                return new ConcurrentHashMap(map);
            case 20:
                Object[] array = ((ArrayList) this.f3330b).toArray(new Xf.c[0]);
                if (array != null) {
                    return (Xf.c[]) array;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            case 21:
                return (C1013q) this.f3330b;
            case 22:
                return Boolean.valueOf(new File((String) this.f3330b).exists());
            case 23:
                return Boolean.valueOf(((EnumC0973L) ((C0967H0) this.f3330b).f8810b).f8821a != null);
            case 24:
                C0969I0 c0969i0 = (C0969I0) this.f3330b;
                String str = c0969i0.f8814a.f8821a;
                return Boolean.valueOf(str != null ? C2576A.x(str, c0969i0.f8815b, true) : false);
            default:
                MayaAccountProvisionFragment mayaAccountProvisionFragment = (MayaAccountProvisionFragment) this.f3330b;
                Bundle arguments15 = mayaAccountProvisionFragment.getArguments();
                if (arguments15 != null) {
                    return arguments15;
                }
                throw new IllegalStateException("Fragment " + mayaAccountProvisionFragment + " has null arguments");
        }
    }
}
