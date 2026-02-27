package o1;

import E1.c;
import Kh.C0301f;
import R1.b;
import We.A;
import We.G;
import We.s;
import android.app.Application;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.webkit.MimeTypeMap;
import android.widget.ImageView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.content.PermissionChecker;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.extractor.ts.PsExtractor;
import ch.AbstractC1103b;
import ch.AbstractC1109h;
import ch.InterfaceC1104c;
import ch.InterfaceC1105d;
import ch.j;
import ch.r;
import ch.w;
import ch.y;
import com.google.android.gms.ads.RequestConfiguration;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.domain.model.AlternativeLandline;
import com.paymaya.domain.model.AlternativeMobile;
import com.paymaya.domain.model.ContactName;
import com.paymaya.domain.model.EducationDetails;
import com.paymaya.domain.model.EmailContact;
import com.paymaya.domain.model.MfaTencentErrorResult;
import com.paymaya.domain.model.ProfileData;
import com.paymaya.domain.model.ProfileDataBuilder;
import com.paymaya.domain.model.ProfileGender;
import com.paymaya.domain.model.ProfileMaritalStatus;
import com.paymaya.domain.model.ProfileTin;
import d4.AbstractC1331a;
import hh.n;
import ih.EnumC1605c;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import jh.e;
import kotlin.jvm.internal.z;
import mx_android.support.v7.media.MediaRouter;
import nh.C1950a;
import of.p;
import pg.u;
import qk.i;
import x3.d;
import y5.q;
import zj.C2576A;

/* JADX INFO: renamed from: o1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1955a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static u f18758b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18759a;

    public /* synthetic */ AbstractC1955a(int i) {
        this.f18759a = i;
    }

    public static int[] A(Collection collection) {
        if (collection instanceof b) {
            b bVar = (b) collection;
            return Arrays.copyOfRange(bVar.f5430a, bVar.f5431b, bVar.c);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static boolean B(Object obj, n nVar, InterfaceC1104c interfaceC1104c) {
        InterfaceC1105d interfaceC1105d;
        EnumC1605c enumC1605c = EnumC1605c.f17149a;
        if (!(obj instanceof Callable)) {
            return false;
        }
        try {
            Object objCall = ((Callable) obj).call();
            if (objCall != null) {
                Object objApply = nVar.apply(objCall);
                e.b(objApply, "The mapper returned a null CompletableSource");
                interfaceC1105d = (InterfaceC1105d) objApply;
            } else {
                interfaceC1105d = null;
            }
            if (interfaceC1105d != null) {
                ((AbstractC1103b) interfaceC1105d).b(interfaceC1104c);
                return true;
            }
            interfaceC1104c.onSubscribe(enumC1605c);
            interfaceC1104c.onComplete();
            return true;
        } catch (Throwable th2) {
            p.F(th2);
            interfaceC1104c.onSubscribe(enumC1605c);
            interfaceC1104c.onError(th2);
            return true;
        }
    }

    public static boolean C(Object obj, n nVar, r rVar) {
        j jVar;
        if (!(obj instanceof Callable)) {
            return false;
        }
        try {
            Object objCall = ((Callable) obj).call();
            if (objCall != null) {
                Object objApply = nVar.apply(objCall);
                e.b(objApply, "The mapper returned a null MaybeSource");
                jVar = (j) objApply;
            } else {
                jVar = null;
            }
            if (jVar == null) {
                EnumC1605c.a(rVar);
                return true;
            }
            ((AbstractC1109h) jVar).b(new C1950a(rVar, 0));
            return true;
        } catch (Throwable th2) {
            p.F(th2);
            EnumC1605c.c(th2, rVar);
            return true;
        }
    }

    public static boolean D(Object obj, n nVar, r rVar) {
        y yVar;
        if (!(obj instanceof Callable)) {
            return false;
        }
        try {
            Object objCall = ((Callable) obj).call();
            if (objCall != null) {
                Object objApply = nVar.apply(objCall);
                e.b(objApply, "The mapper returned a null SingleSource");
                yVar = (y) objApply;
            } else {
                yVar = null;
            }
            if (yVar == null) {
                EnumC1605c.a(rVar);
                return true;
            }
            ((w) yVar).c(new C1950a(rVar, 1));
            return true;
        } catch (Throwable th2) {
            p.F(th2);
            EnumC1605c.c(th2, rVar);
            return true;
        }
    }

    public static void E(Parcel parcel, Parcelable parcelable, int i) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, i);
        }
    }

    public static Object a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static List b(int... iArr) {
        return iArr.length == 0 ? Collections.EMPTY_LIST : new b(iArr, 0, iArr.length);
    }

    public static ProfileData c(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Boolean bool, String str10, String str11) {
        ProfileDataBuilder profileDataBuilder = new ProfileDataBuilder();
        if (str != null) {
            if (str.length() <= 0) {
                str = null;
            }
            if (str != null) {
                profileDataBuilder.setAlternativeLandline(new AlternativeLandline(str));
            }
        }
        if (str2 != null) {
            if (str2.length() <= 0) {
                str2 = null;
            }
            if (str2 != null) {
                profileDataBuilder.setAlternativeMobile(new AlternativeMobile(str2));
            }
        }
        if (str3.length() <= 0) {
            str3 = null;
        }
        if (str3 != null) {
            profileDataBuilder.setEmailContact(new EmailContact(str3));
        }
        if (str4 != null) {
            if (str4.length() <= 0) {
                str4 = null;
            }
            if (str4 != null) {
                profileDataBuilder.setGender(new ProfileGender(str4));
            }
        }
        if (str5 != null) {
            if (str5.length() <= 0) {
                str5 = null;
            }
            if (str5 != null) {
                profileDataBuilder.setProfileMaritalStatus(new ProfileMaritalStatus(str5));
            }
        }
        if (str6 != null) {
            if (str6.length() <= 0) {
                str6 = null;
            }
            if (str6 != null) {
                profileDataBuilder.setTin(new ProfileTin(str6));
            }
        }
        if (str10 != null) {
            if (str10.length() <= 0) {
                str10 = null;
            }
            if (str10 != null) {
                profileDataBuilder.setEducationDetails(new EducationDetails(str10));
            }
        }
        if (str11 != null) {
            if (str11.length() <= 0) {
                str11 = null;
            }
            if (str11 != null) {
                profileDataBuilder.setSss(new ProfileTin(str11));
            }
        }
        profileDataBuilder.setMothersMaidenName(new ContactName(str7, str9, str8, bool));
        return profileDataBuilder.build();
    }

    public static void d(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public static int e(long j) {
        int i = (int) j;
        i.i(((long) i) == j, "Out of range: %s", j);
        return i;
    }

    public static int f(int i, int i4) {
        if (i4 <= 1073741823) {
            return Math.min(Math.max(i, i4), 1073741823);
        }
        throw new IllegalArgumentException(d.r("min (%s) must be less than or equal to max (%s)", Integer.valueOf(i4), 1073741823));
    }

    public static int g(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 90) {
            return 1;
        }
        if (i == 180) {
            return 2;
        }
        if (i == 270) {
            return 3;
        }
        throw new IllegalArgumentException(s.f(i, "Invalid rotation: "));
    }

    public static Gi.d h(String str, boolean z4) {
        if (!z4) {
            return new M2.b(4);
        }
        try {
            return new Gi.a(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Object i(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        if (obj2 != null) {
            return obj2;
        }
        throw new NullPointerException("Both parameters are null");
    }

    public static int j(byte[] bArr) {
        boolean z4 = bArr.length >= 4;
        int length = bArr.length;
        if (!z4) {
            throw new IllegalArgumentException(d.r("array too small: %s < %s", Integer.valueOf(length), 4));
        }
        return (bArr[3] & 255) | ((bArr[2] & 255) << 8) | (bArr[0] << 24) | ((bArr[1] & 255) << 16);
    }

    public static C0301f k(Fragment fragment) {
        return c.r(new Ze.c(fragment).b("android.permission.CAMERA"));
    }

    public static C0301f l(MayaBaseFragment mayaBaseFragment) {
        return c.r(new Ze.c(mayaBaseFragment).b("android.permission.READ_CONTACTS"));
    }

    public static C0301f m(q qVar) {
        return c.r(new Ze.c(qVar).b("android.permission.READ_CONTACTS"));
    }

    public static HashMap n() {
        HashMap map = new HashMap(286);
        ArrayList arrayList = new ArrayList(25);
        arrayList.add("US");
        arrayList.add("AG");
        arrayList.add("AI");
        arrayList.add("AS");
        arrayList.add("BB");
        arrayList.add("BM");
        arrayList.add("BS");
        arrayList.add("CA");
        arrayList.add("DM");
        arrayList.add("DO");
        arrayList.add("GD");
        arrayList.add("GU");
        arrayList.add("JM");
        arrayList.add("KN");
        arrayList.add("KY");
        arrayList.add("LC");
        arrayList.add("MP");
        arrayList.add("MS");
        arrayList.add("PR");
        arrayList.add("SX");
        arrayList.add("TC");
        arrayList.add("TT");
        arrayList.add("VC");
        arrayList.add("VG");
        arrayList.add("VI");
        map.put(1, arrayList);
        ArrayList arrayList2 = new ArrayList(2);
        arrayList2.add("RU");
        arrayList2.add("KZ");
        ArrayList arrayListQ = AbstractC1331a.q(36, map, AbstractC1331a.q(34, map, AbstractC1331a.q(33, map, AbstractC1331a.q(32, map, AbstractC1331a.q(31, map, AbstractC1331a.q(30, map, AbstractC1331a.q(27, map, AbstractC1331a.q(20, map, AbstractC1331a.q(7, map, arrayList2, 1, "EG"), 1, "ZA"), 1, "GR"), 1, "NL"), 1, "BE"), 1, "FR"), 1, "ES"), 1, "HU"), 2, "IT");
        arrayListQ.add("VA");
        map.put(39, arrayListQ);
        ArrayList arrayList3 = new ArrayList(1);
        arrayList3.add("RO");
        ArrayList arrayListQ2 = AbstractC1331a.q(43, map, AbstractC1331a.q(41, map, AbstractC1331a.q(40, map, arrayList3, 1, "CH"), 1, "AT"), 4, "GB");
        arrayListQ2.add("GG");
        arrayListQ2.add("IM");
        arrayListQ2.add("JE");
        map.put(44, arrayListQ2);
        ArrayList arrayList4 = new ArrayList(1);
        arrayList4.add("DK");
        ArrayList arrayListQ3 = AbstractC1331a.q(46, map, AbstractC1331a.q(45, map, arrayList4, 1, "SE"), 2, "NO");
        arrayListQ3.add("SJ");
        map.put(47, arrayListQ3);
        ArrayList arrayList5 = new ArrayList(1);
        arrayList5.add("PL");
        ArrayList arrayListQ4 = AbstractC1331a.q(60, map, AbstractC1331a.q(58, map, AbstractC1331a.q(57, map, AbstractC1331a.q(56, map, AbstractC1331a.q(55, map, AbstractC1331a.q(54, map, AbstractC1331a.q(53, map, AbstractC1331a.q(52, map, AbstractC1331a.q(51, map, AbstractC1331a.q(49, map, AbstractC1331a.q(48, map, arrayList5, 1, "DE"), 1, "PE"), 1, "MX"), 1, "CU"), 1, "AR"), 1, "BR"), 1, "CL"), 1, "CO"), 1, "VE"), 1, "MY"), 3, "AU");
        arrayListQ4.add("CC");
        arrayListQ4.add("CX");
        map.put(61, arrayListQ4);
        ArrayList arrayList6 = new ArrayList(1);
        arrayList6.add("ID");
        ArrayList arrayListQ5 = AbstractC1331a.q(MfaTencentErrorResult.TENCENT_ERROR_LOCAL_REF_FAILED, map, AbstractC1331a.q(98, map, AbstractC1331a.q(95, map, AbstractC1331a.q(94, map, AbstractC1331a.q(93, map, AbstractC1331a.q(92, map, AbstractC1331a.q(91, map, AbstractC1331a.q(90, map, AbstractC1331a.q(86, map, AbstractC1331a.q(84, map, AbstractC1331a.q(82, map, AbstractC1331a.q(81, map, AbstractC1331a.q(66, map, AbstractC1331a.q(65, map, AbstractC1331a.q(64, map, AbstractC1331a.q(63, map, AbstractC1331a.q(62, map, arrayList6, 1, "PH"), 1, "NZ"), 1, "SG"), 1, com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f16153A), 1, "JP"), 1, "KR"), 1, "VN"), 1, "CN"), 1, com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f16194z), 1, "IN"), 1, "PK"), 1, "AF"), 1, "LK"), 1, "MM"), 1, "IR"), 1, "SS"), 2, RequestConfiguration.MAX_AD_CONTENT_RATING_MA);
        arrayListQ5.add("EH");
        map.put(Integer.valueOf(MfaTencentErrorResult.TENCENT_ERROR_USER_STOPS), arrayListQ5);
        ArrayList arrayList7 = new ArrayList(1);
        arrayList7.add("DZ");
        ArrayList arrayListQ6 = AbstractC1331a.q(MediaRouter.GlobalMediaRouter.CallbackHandler.MSG_ROUTE_PRESENTATION_DISPLAY_CHANGED, map, AbstractC1331a.q(MediaRouter.GlobalMediaRouter.CallbackHandler.MSG_ROUTE_VOLUME_CHANGED, map, AbstractC1331a.q(MediaRouter.GlobalMediaRouter.CallbackHandler.MSG_ROUTE_REMOVED, map, AbstractC1331a.q(257, map, AbstractC1331a.q(256, map, AbstractC1331a.q(255, map, AbstractC1331a.q(254, map, AbstractC1331a.q(253, map, AbstractC1331a.q(252, map, AbstractC1331a.q(251, map, AbstractC1331a.q(250, map, AbstractC1331a.q(249, map, AbstractC1331a.q(248, map, AbstractC1331a.q(247, map, AbstractC1331a.q(246, map, AbstractC1331a.q(245, map, AbstractC1331a.q(244, map, AbstractC1331a.q(243, map, AbstractC1331a.q(242, map, AbstractC1331a.q(241, map, AbstractC1331a.q(PsExtractor.VIDEO_STREAM_MASK, map, AbstractC1331a.q(239, map, AbstractC1331a.q(238, map, AbstractC1331a.q(237, map, AbstractC1331a.q(236, map, AbstractC1331a.q(235, map, AbstractC1331a.q(234, map, AbstractC1331a.q(233, map, AbstractC1331a.q(232, map, AbstractC1331a.q(231, map, AbstractC1331a.q(230, map, AbstractC1331a.q(229, map, AbstractC1331a.q(MfaTencentErrorResult.TENCENT_ERROR_NO_FACE_WHILE_CAPTURING, map, AbstractC1331a.q(227, map, AbstractC1331a.q(226, map, AbstractC1331a.q(225, map, AbstractC1331a.q(224, map, AbstractC1331a.q(MfaTencentErrorResult.TENCENT_ERROR_PREPARE_TIME_OUT, map, AbstractC1331a.q(MfaTencentErrorResult.TENCENT_ERROR_LOCAL_TIME_OUT, map, AbstractC1331a.q(221, map, AbstractC1331a.q(MfaTencentErrorResult.TENCENT_ERROR_LIVE_DATA, map, AbstractC1331a.q(MfaTencentErrorResult.TENCENT_ERROR_PERMISSION_CHECK, map, AbstractC1331a.q(MfaTencentErrorResult.TENCENT_ERROR_INIT_SDK, map, AbstractC1331a.q(MfaTencentErrorResult.TENCENT_ERROR_INNER_ERROR_CODE, map, arrayList7, 1, "TN"), 1, "LY"), 1, "GM"), 1, "SN"), 1, "MR"), 1, "ML"), 1, "GN"), 1, "CI"), 1, "BF"), 1, "NE"), 1, "TG"), 1, "BJ"), 1, "MU"), 1, "LR"), 1, "SL"), 1, "GH"), 1, "NG"), 1, com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f16154B), 1, "CF"), 1, "CM"), 1, "CV"), 1, "ST"), 1, "GQ"), 1, "GA"), 1, "CG"), 1, "CD"), 1, "AO"), 1, "GW"), 1, "IO"), 1, "AC"), 1, "SC"), 1, "SD"), 1, "RW"), 1, "ET"), 1, "SO"), 1, "DJ"), 1, "KE"), 1, "TZ"), 1, "UG"), 1, "BI"), 1, "MZ"), 1, "ZM"), 1, "MG"), 2, "RE");
        arrayListQ6.add("YT");
        map.put(Integer.valueOf(MediaRouter.GlobalMediaRouter.CallbackHandler.MSG_ROUTE_SELECTED), arrayListQ6);
        ArrayList arrayList8 = new ArrayList(1);
        arrayList8.add("ZW");
        ArrayList arrayListQ7 = AbstractC1331a.q(269, map, AbstractC1331a.q(268, map, AbstractC1331a.q(267, map, AbstractC1331a.q(266, map, AbstractC1331a.q(265, map, AbstractC1331a.q(264, map, AbstractC1331a.q(MediaRouter.GlobalMediaRouter.CallbackHandler.MSG_ROUTE_UNSELECTED, map, arrayList8, 1, "NA"), 1, "MW"), 1, "LS"), 1, "BW"), 1, "SZ"), 1, "KM"), 2, "SH");
        arrayListQ7.add("TA");
        map.put(290, arrayListQ7);
        ArrayList arrayList9 = new ArrayList(1);
        arrayList9.add("ER");
        ArrayList arrayListQ8 = AbstractC1331a.q(357, map, AbstractC1331a.q(356, map, AbstractC1331a.q(355, map, AbstractC1331a.q(354, map, AbstractC1331a.q(353, map, AbstractC1331a.q(352, map, AbstractC1331a.q(351, map, AbstractC1331a.q(350, map, AbstractC1331a.q(299, map, AbstractC1331a.q(298, map, AbstractC1331a.q(297, map, AbstractC1331a.q(291, map, arrayList9, 1, "AW"), 1, "FO"), 1, "GL"), 1, "GI"), 1, "PT"), 1, "LU"), 1, "IE"), 1, "IS"), 1, "AL"), 1, "MT"), 1, "CY"), 2, "FI");
        arrayListQ8.add("AX");
        map.put(358, arrayListQ8);
        ArrayList arrayList10 = new ArrayList(1);
        arrayList10.add("BG");
        ArrayList arrayListQ9 = AbstractC1331a.q(509, map, AbstractC1331a.q(TypedValues.PositionType.TYPE_CURVE_FIT, map, AbstractC1331a.q(TypedValues.PositionType.TYPE_PERCENT_Y, map, AbstractC1331a.q(TypedValues.PositionType.TYPE_PERCENT_X, map, AbstractC1331a.q(TypedValues.PositionType.TYPE_SIZE_PERCENT, map, AbstractC1331a.q(TypedValues.PositionType.TYPE_PERCENT_HEIGHT, map, AbstractC1331a.q(TypedValues.PositionType.TYPE_PERCENT_WIDTH, map, AbstractC1331a.q(TypedValues.PositionType.TYPE_DRAWPATH, map, AbstractC1331a.q(TypedValues.PositionType.TYPE_TRANSITION_EASING, map, AbstractC1331a.q(500, map, AbstractC1331a.q(TypedValues.CycleType.TYPE_WAVE_PERIOD, map, AbstractC1331a.q(421, map, AbstractC1331a.q(TypedValues.CycleType.TYPE_EASING, map, AbstractC1331a.q(389, map, AbstractC1331a.q(387, map, AbstractC1331a.q(386, map, AbstractC1331a.q(385, map, AbstractC1331a.q(383, map, AbstractC1331a.q(382, map, AbstractC1331a.q(381, map, AbstractC1331a.q(380, map, AbstractC1331a.q(378, map, AbstractC1331a.q(377, map, AbstractC1331a.q(376, map, AbstractC1331a.q(375, map, AbstractC1331a.q(374, map, AbstractC1331a.q(373, map, AbstractC1331a.q(372, map, AbstractC1331a.q(371, map, AbstractC1331a.q(370, map, AbstractC1331a.q(359, map, arrayList10, 1, "LT"), 1, "LV"), 1, "EE"), 1, "MD"), 1, "AM"), 1, "BY"), 1, "AD"), 1, "MC"), 1, "SM"), 1, "UA"), 1, "RS"), 1, "ME"), 1, "XK"), 1, "HR"), 1, "SI"), 1, "BA"), 1, "MK"), 1, "CZ"), 1, "SK"), 1, com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f16190v), 1, "FK"), 1, "BZ"), 1, "GT"), 1, "SV"), 1, "HN"), 1, "NI"), 1, "CR"), 1, "PA"), 1, "PM"), 1, "HT"), 3, "GP");
        arrayListQ9.add("BL");
        arrayListQ9.add("MF");
        map.put(590, arrayListQ9);
        ArrayList arrayList11 = new ArrayList(1);
        arrayList11.add("BO");
        ArrayList arrayListQ10 = AbstractC1331a.q(598, map, AbstractC1331a.q(597, map, AbstractC1331a.q(596, map, AbstractC1331a.q(595, map, AbstractC1331a.q(594, map, AbstractC1331a.q(593, map, AbstractC1331a.q(592, map, AbstractC1331a.q(591, map, arrayList11, 1, "GY"), 1, "EC"), 1, "GF"), 1, "PY"), 1, "MQ"), 1, "SR"), 1, "UY"), 2, "CW");
        arrayListQ10.add("BQ");
        map.put(599, arrayListQ10);
        ArrayList arrayList12 = new ArrayList(1);
        arrayList12.add("TL");
        map.put(Integer.valueOf(DescriptorProtos.Edition.EDITION_PROTO2_VALUE), AbstractC1331a.q(996, map, AbstractC1331a.q(995, map, AbstractC1331a.q(994, map, AbstractC1331a.q(993, map, AbstractC1331a.q(992, map, AbstractC1331a.q(979, map, AbstractC1331a.q(977, map, AbstractC1331a.q(976, map, AbstractC1331a.q(975, map, AbstractC1331a.q(974, map, AbstractC1331a.q(973, map, AbstractC1331a.q(972, map, AbstractC1331a.q(971, map, AbstractC1331a.q(970, map, AbstractC1331a.q(968, map, AbstractC1331a.q(967, map, AbstractC1331a.q(966, map, AbstractC1331a.q(965, map, AbstractC1331a.q(964, map, AbstractC1331a.q(963, map, AbstractC1331a.q(962, map, AbstractC1331a.q(961, map, AbstractC1331a.q(960, map, AbstractC1331a.q(888, map, AbstractC1331a.q(886, map, AbstractC1331a.q(883, map, AbstractC1331a.q(882, map, AbstractC1331a.q(881, map, AbstractC1331a.q(880, map, AbstractC1331a.q(878, map, AbstractC1331a.q(870, map, AbstractC1331a.q(856, map, AbstractC1331a.q(855, map, AbstractC1331a.q(853, map, AbstractC1331a.q(852, map, AbstractC1331a.q(850, map, AbstractC1331a.q(808, map, AbstractC1331a.q(800, map, AbstractC1331a.q(692, map, AbstractC1331a.q(691, map, AbstractC1331a.q(690, map, AbstractC1331a.q(689, map, AbstractC1331a.q(688, map, AbstractC1331a.q(687, map, AbstractC1331a.q(686, map, AbstractC1331a.q(685, map, AbstractC1331a.q(683, map, AbstractC1331a.q(682, map, AbstractC1331a.q(681, map, AbstractC1331a.q(680, map, AbstractC1331a.q(679, map, AbstractC1331a.q(678, map, AbstractC1331a.q(677, map, AbstractC1331a.q(676, map, AbstractC1331a.q(675, map, AbstractC1331a.q(674, map, AbstractC1331a.q(673, map, AbstractC1331a.q(672, map, AbstractC1331a.q(670, map, arrayList12, 1, "NF"), 1, "BN"), 1, "NR"), 1, RequestConfiguration.MAX_AD_CONTENT_RATING_PG), 1, "TO"), 1, "SB"), 1, "VU"), 1, "FJ"), 1, "PW"), 1, "WF"), 1, "CK"), 1, "NU"), 1, "WS"), 1, "KI"), 1, "NC"), 1, "TV"), 1, "PF"), 1, "TK"), 1, "FM"), 1, "MH"), 1, "001"), 1, "001"), 1, "KP"), 1, "HK"), 1, "MO"), 1, "KH"), 1, "LA"), 1, "001"), 1, "001"), 1, "BD"), 1, "001"), 1, "001"), 1, "001"), 1, "TW"), 1, "001"), 1, "MV"), 1, "LB"), 1, "JO"), 1, "SY"), 1, "IQ"), 1, "KW"), 1, "SA"), 1, "YE"), 1, "OM"), 1, "PS"), 1, "AE"), 1, "IL"), 1, "BH"), 1, "QA"), 1, "BT"), 1, "MN"), 1, "NP"), 1, "001"), 1, "TJ"), 1, "TM"), 1, "AZ"), 1, "GE"), 1, "KG"), 1, "UZ"));
        return map;
    }

    public static final String o() {
        Application application;
        String str = Build.DEVICE;
        String strF = i.f(Build.MODEL);
        try {
            try {
                application = (Application) Class.forName("android.app.ActivityThread").getMethod("currentApplication", null).invoke(null, null);
            } catch (Exception unused) {
                throw new RuntimeException("DeviceName must be initialized before usage.");
            }
        } catch (Exception unused2) {
            application = (Application) Class.forName("android.app.AppGlobals").getMethod("getInitialApplication", null).invoke(null, null);
        }
        String str2 = i.w(application).f7225b;
        if (str2 != null) {
            strF = str2;
        }
        kotlin.jvm.internal.j.f(strF, "getDeviceName(...)");
        return strF;
    }

    public static C0301f p(FragmentActivity fragmentActivity) {
        return c.r(new Ze.c(fragmentActivity).c("android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"));
    }

    public static C0301f q(MayaBaseFragment mayaBaseFragment) {
        return c.r(new Ze.c(mayaBaseFragment).c("android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"));
    }

    public static final String r(Context context, Uri uri) {
        kotlin.jvm.internal.j.g(uri, "<this>");
        if (context == null) {
            return null;
        }
        if ("content".equals(uri.getScheme())) {
            return context.getContentResolver().getType(uri);
        }
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(uri.toString());
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        kotlin.jvm.internal.j.d(fileExtensionFromUrl);
        Locale locale = Locale.getDefault();
        kotlin.jvm.internal.j.f(locale, "getDefault(...)");
        String lowerCase = fileExtensionFromUrl.toLowerCase(locale);
        kotlin.jvm.internal.j.f(lowerCase, "toLowerCase(...)");
        return singleton.getMimeTypeFromExtension(lowerCase);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(1:(10:12|79|13|52|62|(1:64)(1:65)|66|(1:(1:69))(1:(1:71)(1:72))|73|74)(2:17|18))(4:19|85|20|21))(8:24|87|25|77|26|29|(1:32)|50)|75|33|34|83|44|81|45|48|(8:51|52|62|(0)(0)|66|(0)(0)|73|74)|50|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008d, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008e, code lost:
    
        r4 = r12;
        r12 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a8, code lost:
    
        r12 = "safeRequest";
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c8, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e3, code lost:
    
        r2 = r12;
        r1 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e7, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object s(io.ktor.client.plugins.ResponseException r12, ij.AbstractC1609c r13) {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.AbstractC1955a.s(io.ktor.client.plugins.ResponseException, ij.c):java.lang.Object");
    }

    public static int t(int i, int i4, int i6, int[] iArr) {
        while (i4 < i6) {
            if (iArr[i4] == i) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    public static boolean u(Context context, String str) {
        return ContextCompat.checkSelfPermission(context, str) == 0;
    }

    public static boolean v(FragmentActivity fragmentActivity, String str) {
        return !ActivityCompat.shouldShowRequestPermissionRationale(fragmentActivity, str) && PermissionChecker.checkSelfPermission(fragmentActivity, str) == -1;
    }

    public static final void w(ImageView imageView, String str, boolean z4) {
        kotlin.jvm.internal.j.g(imageView, "<this>");
        if (str == null || C2576A.H(str)) {
            return;
        }
        G gH = A.d().h(str);
        gH.h(2131231490);
        gH.b(2131231490);
        if (!z4) {
            gH.f(2);
            gH.g(2);
        }
        gH.e(imageView, null);
    }

    public static final void x(ImageView imageView, File file, float f) {
        if (file.exists()) {
            RoundedBitmapDrawable roundedBitmapDrawableCreate = RoundedBitmapDrawableFactory.create(imageView.getResources(), BitmapFactory.decodeFile(file.getPath()));
            kotlin.jvm.internal.j.f(roundedBitmapDrawableCreate, "create(...)");
            roundedBitmapDrawableCreate.setCornerRadius(f);
            imageView.setImageDrawable(roundedBitmapDrawableCreate);
        }
    }

    public static int z(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public int hashCode() {
        switch (this.f18759a) {
            case 9:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.f18759a) {
            case 9:
                String strC = z.a(getClass()).c();
                kotlin.jvm.internal.j.d(strC);
                return strC;
            default:
                return super.toString();
        }
    }

    public abstract void y(String str);
}
