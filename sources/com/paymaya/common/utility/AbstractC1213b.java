package com.paymaya.common.utility;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import bg.AbstractC0983W;
import bj.AbstractC1039j;
import com.dynatrace.android.agent.Global;
import com.paymaya.domain.model.FeatureDynamicStatus;
import com.paymaya.domain.model.SecondaryFeature;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.paymaya.common.utility.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC1213b {
    public static /* synthetic */ String A(int i) {
        switch (i) {
            case 1:
                return "LOGIN_SCREEN";
            case 2:
                return "LOGIN_DATA_PRIVACY_DIALOG";
            case 3:
                return "LOGIN_V3_DATA_PRIVACY";
            case 4:
                return "LOGIN_MAYA_PH_TC";
            case 5:
                return "LOGIN_MAYA_PH_PRIVACY_POLICY";
            case 6:
                return "LOGIN_DATA_PERSONALIZATION";
            case 7:
                return "LOGIN_HELP_CENTER";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String B(int i) {
        switch (i) {
            case 1:
                return "MFA_TENCENT";
            case 2:
                return "MFA_FACE_VERIFY_SCREEN";
            case 3:
                return "MFA_FACE_TENCENT_SCREEN";
            case 4:
                return "MFA_FACE_SCREEN_NO_FACE_DATA";
            case 5:
                return "MFA_FACE_SCREEN_RETRY";
            case 6:
                return "MFA_FACE_SCREEN_MISMATCH";
            case 7:
                return "MFA_FACE_SCREEN_SUPPORT";
            case 8:
                return "MFA_FACE_SCREEN_PARTIAL_MATCH";
            case 9:
                return "MFA_OTP_SCREEN";
            case 10:
                return "MFA_OTP_SCREEN_MAX_ATTEMPTS";
            case 11:
                return "MFA_OTP_SCREEN_MAX_RESEND";
            case 12:
                return "MFA_OTP_SCREEN_EXPIRED";
            case 13:
                return "MFA_FACE_SCREEN_TENCENT";
            case 14:
                return "MFA_FACE";
            case 15:
                return "MFA_OTP";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String C(int i) {
        switch (i) {
            case 1:
                return "QR_ACTION";
            case 2:
                return "QR_CODE";
            case 3:
                return "QR_PAYMENT";
            case 4:
                return "QR_PAYMENT_BUTTON";
            case 5:
                return "QR_SCAN";
            case 6:
                return "QR_SCAN_PAGE";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String D(int i) {
        switch (i) {
            case 1:
                return "REG_ONBOARDING_SCREEN";
            case 2:
                return "REG_MAYA_START_PAGE";
            case 3:
                return "REG_SCREEN";
            case 4:
                return "REG_DATA_PRIVACY";
            case 5:
                return "REG_DRAWDOWN";
            case 6:
                return "REG_DATA_PERSONAL";
            case 7:
                return "REG_TEXT";
            case 8:
                return "REG_OTP";
            case 9:
                return "REG_LOC_PERMISSION";
            case 10:
                return "REG_LOC_PERMISSION_OS";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String E(int i) {
        switch (i) {
            case 1:
                return "REGV2_LANDING_PAGE";
            case 2:
                return "REGV2_ACCOUNT_CREATION";
            case 3:
                return "REGV2_ACCOUNT_PROVISION";
            case 4:
                return "REGV2_MAYA_PH_PRIVACY_POLICY";
            case 5:
                return "REGV2_MAYA_PH_TC";
            case 6:
                return "REGV2_MAYA_BANK_PRIVACY_POLICY";
            case 7:
                return "REGV2_MAYA_BANK_TC";
            case 8:
                return "REGV2_MAYA_BANK_SAVINGS_TC";
            case 9:
                return "REGV2_LOC_PERMISSION";
            case 10:
                return "REGV2_DISCLOSURE";
            case 11:
                return "REGV2_OTP";
            case 12:
                return "REGV2_SUCCESS_BOTTOM_SHEET";
            case 13:
                return "REGV2";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String F(int i) {
        switch (i) {
            case 1:
                return "SHOP_AD";
            case 2:
                return "SHOP_BRAND";
            case 3:
                return "SHOP_BRAND_LIST";
            case 4:
                return "SHOP_CATEGORY";
            case 5:
                return "SHOP_CONTACTS";
            case 6:
                return "SHOP_CONTACT_NAME";
            case 7:
                return "SHOP_HISTORY";
            case 8:
                return "SHOP_HISTORY_CTA";
            case 9:
                return "SHOP_HISTORY_ITEM";
            case 10:
                return "SHOP_HOME";
            case 11:
                return "SHOP_HOME_CTA";
            case 12:
                return "SHOP_PRODUCT";
            case 13:
                return "SHOP_PRODUCT_DETAILS";
            case 14:
                return "SHOP_PRODUCT_OPTION";
            case 15:
                return "SHOP_PRODUCTS_LIST";
            case 16:
                return "SHOP_SEARCH";
            case 17:
                return "SHOP_SEARCH_RESULTS";
            case 18:
                return "SHOP_SUBCATEGORY";
            case 19:
                return "SHOP_SUBCATEGORY_PAGE";
            case 20:
                return "SHOP_ERROR_SCREEN";
            default:
                throw null;
        }
    }

    public static int G(int i, int i4, int i6, int i10) {
        return i10 - (i6 - (i + i4));
    }

    public static int H(int i, int i4, int i6, int i10, int i11) {
        return i11 - (i10 - ((i + i4) + i6));
    }

    public static int I(Parcelable.Creator creator, Parcel parcel, ArrayList arrayList, int i, int i4) {
        arrayList.add(creator.createFromParcel(parcel));
        return i + i4;
    }

    public static SecondaryFeature.Builder J(Resources resources, int i, SecondaryFeature.Builder builder, String str, FeatureDynamicStatus featureDynamicStatus) {
        return builder.mLabel(resources.getString(i)).mUri(str).mFeatureDynamicStatus(featureDynamicStatus);
    }

    public static SecondaryFeature K(Number number, SecondaryFeature.Builder builder) {
        return builder.mImageResource(number.intValue()).build();
    }

    public static NullPointerException L(Throwable th2, String str, Throwable th3) {
        AbstractC0983W.G(th2);
        NullPointerException nullPointerException = new NullPointerException(str);
        nullPointerException.initCause(th3);
        return nullPointerException;
    }

    public static String M(String str, String str2, String str3) {
        return new zj.o(str).f(str3, str2);
    }

    public static String N(StringBuilder sb2, Boolean bool, String str) {
        sb2.append(bool);
        sb2.append(str);
        return sb2.toString();
    }

    public static StringBuilder O(Integer num, String str, String str2, String str3, String str4) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(num);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        return sb2;
    }

    public static Iterator P(Parcel parcel, int i, List list) {
        parcel.writeInt(i);
        parcel.writeInt(list.size());
        return list.iterator();
    }

    public static Iterator Q(List list, Parcel parcel) {
        parcel.writeInt(list.size());
        return list.iterator();
    }

    public static ConcurrentHashMap R(Object obj) {
        AbstractC1039j.b(obj);
        return new ConcurrentHashMap();
    }

    public static void S(Parcel parcel, int i, Boolean bool) {
        parcel.writeInt(i);
        parcel.writeInt(bool.booleanValue() ? 1 : 0);
    }

    public static void T(Parcel parcel, int i, Integer num) {
        parcel.writeInt(i);
        parcel.writeInt(num.intValue());
    }

    public static boolean U(String str, String str2) {
        return new zj.o(str).e(str2);
    }

    public static /* synthetic */ int V(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("LOAN_ACTIVE")) {
            return 1;
        }
        if (str.equals("LOAN_ACTIVE_MISSING_INFO")) {
            return 2;
        }
        if (str.equals("LOAN_MISSING")) {
            return 3;
        }
        if (str.equals("LOAN_INVALID")) {
            return 4;
        }
        throw new IllegalArgumentException("No enum constant com.paymaya.common.utility.Enum.CREDIT_WALLET_BANNER_STATUS.".concat(str));
    }

    public static final String a(int i) {
        return C(i).concat("_ERROR_SCREEN");
    }

    public static final String b(int i) {
        return D(i).concat("_ERROR_TAPPED");
    }

    public static final String c(int i) {
        return E(i).concat("_ERROR_TAPPED");
    }

    public static final String d(int i) {
        return D(i).concat("_ERROR_VIEWED");
    }

    public static final String e(int i) {
        return E(i).concat("_ERROR_VIEWED");
    }

    public static final String f(int i) {
        return B(i).concat("_FAILURE");
    }

    public static final String g(int i) {
        return D(i).concat("_INPUTTED");
    }

    public static final String h(int i) {
        return E(i).concat("_SCREEN");
    }

    public static final String i(int i) {
        return B(i).concat("_SUCCESS");
    }

    public static final String j(int i) {
        return y(i).concat("_TAPPED");
    }

    public static final String k(int i, EnumC1217f enumC1217f) {
        String str;
        StringBuilder sb2 = new StringBuilder();
        if (i == 1) {
            str = "MGM_REFEREE_PAGE_PERFORMED";
        } else if (i == 2) {
            str = "MGM_REFERRER_PAGE_PERFORMED";
        } else if (i == 3) {
            str = "REFEREE_MGM_WELCOME";
        } else {
            if (i != 4) {
                throw null;
            }
            str = "REFEREE_MGM_INPUT_CODE";
        }
        sb2.append(str);
        sb2.append(Global.UNDERSCORE);
        return We.s.p(sb2, enumC1217f.f11196a, "_TAPPED");
    }

    public static final String l(int i) {
        return A(i).concat("_TAPPED");
    }

    public static final String m(int i) {
        return B(i).concat("_TAPPED");
    }

    public static final String n(int i) {
        return C(i).concat("_TAPPED");
    }

    public static final String o(int i) {
        return D(i).concat("_TAPPED");
    }

    public static final String p(int i) {
        return E(i).concat("_TAPPED");
    }

    public static final String q(int i) {
        return F(i).concat("_TAPPED");
    }

    public static final String r(int i) {
        return y(i).concat("_VIEWED");
    }

    public static final String s(int i) {
        return B(i).concat("_VIEWED");
    }

    public static final String t(int i) {
        return C(i).concat("_VIEWED");
    }

    public static final String u(int i) {
        return D(i).concat("_VIEWED");
    }

    public static final String v(int i) {
        return E(i).concat("_VIEWED");
    }

    public static final String w(int i) {
        return F(i).concat("_VIEWED");
    }

    public static /* synthetic */ String x(int i) {
        switch (i) {
            case 1:
                return "paymaya://paybills?category=transportation";
            case 2:
                return "paymaya://paybills?category=travel";
            case 3:
                return "paymaya://shop/history";
            case 4:
                return "paymaya://shop";
            case 5:
                return "paymaya://load";
            case 6:
                return "paymaya://paybills/receipt";
            case 7:
                return "paymaya://paybills";
            case 8:
                return "paymaya://sendmoney";
            case 9:
                return "paymaya://banktransfer";
            case 10:
                return "paymaya://pullfunds";
            case 11:
                return "paymaya://addmoney/card";
            case 12:
                return "paymaya://addmoney";
            case 13:
                return "paymaya://mycards/link";
            case 14:
                return "paymaya://mycards/virtual/view";
            case 15:
                return "paymaya://mycards";
            case 16:
                return "paymaya://mycards/carddashboard/benefits";
            case 17:
                return "paymaya://mycards/carddashboard/mbcc-benefits";
            case 18:
                return "paymaya://mycards/carddashboard/catalog";
            case 19:
                return "paymaya://mycards/carddashboard/mbcc-deals";
            case 20:
                return "paymaya://mycards/creditcarddashboard";
            case 21:
                return "paymaya://mycards/activatecreditcard";
            case 22:
                return "paymaya://mycards/creditcard/transaction/receipt";
            case 23:
                return "paymaya://refer";
            case 24:
                return "paymaya://submitinvitecode";
            case 25:
                return "paymaya://upgrade";
            case 26:
                return "paymaya://login";
            case 27:
                return "paymaya://registration";
            case 28:
                return "paymaya://vouchers";
            case 29:
                return "paymaya://food";
            case 30:
                return "paymaya://retail";
            case 31:
                return "paymaya://government";
            case 32:
                return "paymaya://mall";
            case 33:
                return "paymaya://donations";
            case 34:
                return "paymaya://playmaya/packages/spotify";
            case 35:
                return "paymaya://playmaya";
            case 36:
                return "paymaya://protect";
            case 37:
                return "paymaya://missions";
            case 38:
                return "paymaya://accountlimits";
            case 39:
                return "paymaya://inbox";
            case 40:
                return "paymaya://accountrecovery";
            case 41:
                return "paymaya://merchant";
            case 42:
                return "paymaya://changemobilenumber";
            case 43:
                return "paymaya://help";
            case 44:
                return "paymaya://transport/beep";
            case 45:
                return "paymaya://transport";
            case 46:
                return "paymaya://more";
            case 47:
                return "paymaya://loans";
            case 48:
                return "paymaya://loans/icl";
            case 49:
                return "paymaya://credit/card";
            case 50:
                return "paymaya://credit/card/about";
            case 51:
                return "paymaya://credit/card/pending";
            case 52:
                return "paymaya://credit/card/repayment";
            case 53:
                return "paymaya://partnermerchant";
            case 54:
                return "paymaya://pwp";
            case 55:
                return "paymaya://deals";
            case 56:
                return "paymaya://quickguide";
            case 57:
                return "paymaya://requestmoney";
            case 58:
                return "paymaya://scanqr";
            case 59:
                return "paymaya://publicname";
            case 60:
                return "paymaya://datapersonalization";
            case 61:
                return "paymaya://favorites";
            case 62:
                return "paymaya://moneycard";
            case 63:
                return "paymaya://luckygames";
            case 64:
                return "paymaya://invest";
            case 65:
                return "paymaya://crypto_v2";
            case 66:
                return "paymaya://funds";
            case 67:
                return "paymaya://mayacredit";
            case 68:
                return "paymaya://walletdashboard";
            case 69:
                return "paymaya://profile";
            case 70:
                return "paymaya://savings";
            case 71:
                return "paymaya://saving_to_wallet";
            case 72:
                return "paymaya://create_savings";
            case 73:
                return "paymaya://cards/store";
            case 74:
                return "paymaya://merchantrewards";
            case 75:
                return "paymaya://lucky_games";
            case 76:
                return "paymaya://insurance";
            case 77:
                return "paymaya://paylater";
            case 78:
                return "paymaya://stocks";
            case 79:
                return "paymaya://stocksgame";
            case 80:
                return "paymaya://globalstocks";
            case 81:
                return "paymaya://globalremittance";
            case 82:
                return "paymaya://mayafunds";
            case 83:
                return "paymaya://approvalrequests";
            case 84:
                return "paymaya://walletoptions/autocashin?origin=push";
            case 85:
                return "paymaya://walletoptions/autocashin";
            case 86:
                return "paymaya://chatwithus";
            case 87:
                return "paymaya://profile/addlpersonaldetails";
            case 88:
                return "paymaya://profile/workdetails";
            case 89:
                return "paymaya://profile/contactreference";
            case 90:
                return "paymaya://profile/underwritingrequirements";
            case 91:
                return "paymaya://profile/personaldetails";
            case 92:
                return "paymaya://services";
            case 93:
                return "paymaya://onboarding";
            case 94:
                return "paymaya://pbb";
            case 95:
                return "paymaya://rafflegame";
            case 96:
                return "paymaya://esims";
            case 97:
                return "paymaya://esimboxo";
            case 98:
                return "paymaya://stream";
            case 99:
                return "paymaya://sparkhackathon";
            case 100:
                return "paymaya://loginhistory";
            case 101:
                return "paymaya://securitycenter";
            case 102:
                return "paymaya://philippineairlines";
            case 103:
                return "paymaya://purchasefinancing";
            case 104:
                return "paymaya://scheduler";
            case 105:
                return "paymaya://giveaway";
            case 106:
                return "paymaya://xp";
            case 107:
                return "paymaya://xp/earn";
            case 108:
                return "paymaya://mayapay/pay";
            case 109:
                return "paymaya://tickets";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String y(int i) {
        switch (i) {
            case 1:
                return "CASH_IN_CODE_ABANDON_POP_UP";
            case 2:
                return "CASH_IN_ACCOUNT_UPGRADE_POP_UP";
            case 3:
                return "CASH_IN_BANNER";
            case 4:
                return "CASH_IN_CODE_PAGE";
            case 5:
                return "CASH_IN_CODE_GENERATION_FAILURE";
            case 6:
                return "CASH_IN_PAGE";
            case 7:
                return "CASH_IN_PAGE_BUTTON";
            case 8:
                return "CASH_IN_PARTNER_PAGE";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String z(int i) {
        if (i == 1) {
            return "MEC_APPLICATION";
        }
        if (i == 2) {
            return "MEC_APPLICATION_GEOLOC";
        }
        if (i == 3) {
            return "MEC_DRAWDOWN_GEOLOC";
        }
        throw null;
    }
}
