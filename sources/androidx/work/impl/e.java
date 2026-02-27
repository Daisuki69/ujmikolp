package androidx.work.impl;

import G5.C0251a;
import G5.t;
import Kh.C0300e;
import Kh.T;
import N5.x1;
import Xb.o;
import Xb.p;
import Xb.r;
import Xb.u;
import a.AbstractC0617a;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableStringBuilder;
import android.text.style.RelativeSizeSpan;
import android.text.style.SuperscriptSpan;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentResultListener;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.work.impl.WorkDatabase;
import b3.C0873M;
import b3.C0874N;
import b3.C0891l;
import b3.EnumC0892m;
import ba.D;
import bd.RunnableC0941d;
import c8.InterfaceC1083a;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.google.firebase.messaging.A;
import com.google.firebase.messaging.C;
import com.google.gson.internal.l;
import com.google.gson.internal.s;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.b0;
import com.paymaya.common.widget.HtmlTextView;
import com.paymaya.data.database.repository.C1237a;
import com.paymaya.data.database.repository.C1244h;
import com.paymaya.data.database.repository.J;
import com.paymaya.data.database.repository.y;
import com.paymaya.domain.model.AccessToken;
import com.paymaya.domain.model.AccountBalance;
import com.paymaya.domain.model.Amount;
import com.paymaya.domain.model.Biller;
import com.paymaya.domain.model.ContactModel;
import com.paymaya.domain.model.LoanInstance;
import com.paymaya.domain.model.Profile;
import com.paymaya.domain.model.ShopProviderSubcategory;
import com.paymaya.domain.model.Voucher;
import com.paymaya.domain.model.VoucherReminder;
import com.paymaya.domain.store.C1247a;
import com.paymaya.domain.store.C1261h;
import com.paymaya.domain.store.C1285t0;
import com.paymaya.domain.store.c1;
import com.paymaya.mayaui.common.view.widget.MayaAutoCompleteInputLayout;
import com.paymaya.mayaui.favorite.model.FavoriteCategory;
import com.paymaya.mayaui.favorite.view.fragment.impl.MayaAddFavoriteFragment;
import com.paymaya.mayaui.favorite.view.fragment.impl.MayaFavoriteFragment;
import com.paymaya.mayaui.paybills.view.fragment.impl.MayaPayBillsReceiptFragment;
import com.paymaya.mayaui.regv2.view.bottomsheet.impl.MayaProminentDisclosureBottomSheetDialogFragment;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopPaymentFragment;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopProviderPageProductsListFragment;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopProviderProductsListFragment;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopProviderProductsListSearchFragment;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopSearchFragment;
import com.paymaya.ui.common.view.widget.Carousel;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import kotlin.jvm.internal.j;
import mx_android.support.v7.media.MediaRouteProviderProtocol;
import zj.C2576A;
import zj.C2581c;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements SupportSQLiteOpenHelper.Factory, Z0.f, Ch.a, Rc.b, t, FragmentResultListener, NestedScrollView.OnScrollChangeListener, Ah.i, Continuation, OnCompleteListener, l, Ch.f, Ch.c, b2.c, TabLayoutMediator.TabConfigurationStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8239b;

    public /* synthetic */ e(Object obj, int i) {
        this.f8238a = i;
        this.f8239b = obj;
    }

    @Override // Rc.b
    public void a(int i) {
        Carousel carousel = (Carousel) this.f8239b;
        Handler handler = carousel.f14450k;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        if (i <= 0) {
            carousel.b();
            return;
        }
        carousel.getCarouselLoading3().setVisibility(8);
        carousel.getCarouselLoading2().setVisibility(8);
        carousel.getCarouselLoading().setVisibility(8);
        carousel.getCarouselTitle().setVisibility(carousel.f14461w ? 8 : 0);
        carousel.getCarouselRecyclerView().setVisibility(0);
        if (carousel.f14459u && i >= carousel.f14460v) {
            carousel.f14452n = 1073741823;
            while (true) {
                int i4 = carousel.f14452n;
                if (i4 % i == 0) {
                    break;
                } else {
                    carousel.f14452n = i4 + 1;
                }
            }
            carousel.getCarouselRecyclerView().scrollToPosition(carousel.f14452n);
            carousel.getCarouselRecyclerView().post(new RunnableC0941d(carousel, 0));
        }
        carousel.d();
    }

    @Override // Ch.c
    public void accept(Object obj) {
        switch (this.f8238a) {
            case 19:
                C1237a c1237a = ((C1247a) this.f8239b).c;
                c1237a.getClass();
                List<AccountBalance> listSingletonList = Collections.singletonList((AccountBalance) obj);
                ArrayList arrayList = new ArrayList(listSingletonList.size());
                for (AccountBalance accountBalance : listSingletonList) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("balance_id", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                    Amount amountMCurrentBalance = accountBalance.mCurrentBalance();
                    contentValues.put("current_currency", amountMCurrentBalance.mCurrency());
                    contentValues.put("current_value", amountMCurrentBalance.mValue());
                    Amount amountMAvailableBalance = accountBalance.mAvailableBalance();
                    contentValues.put("available_currency", amountMAvailableBalance.mCurrency());
                    contentValues.put("available_value", amountMAvailableBalance.mValue());
                    arrayList.add(contentValues);
                }
                c1237a.f11303a.c("account_balance", Collections.unmodifiableList(arrayList));
                break;
            case 20:
                ((C1261h) this.f8239b).c.O(((AccessToken) obj).mValue());
                break;
            case 21:
                ((Lh.a) this.f8239b).b((List) obj);
                break;
            case 22:
                ((C1244h) this.f8239b).a((Biller) obj);
                break;
            case 23:
                ((Uh.d) this.f8239b).onNext((Throwable) obj);
                break;
            default:
                ((y) this.f8239b).a((List) obj);
                break;
        }
    }

    @Override // Z0.f
    public Object apply(Object obj) {
        Object obj2 = this.f8239b;
        switch (this.f8238a) {
            case 1:
                C0873M c0873m = (C0873M) obj;
                ((C0891l) obj2).getClass();
                String strA = C0874N.f8399b.a(c0873m);
                j.f(strA, "encode(...)");
                c0873m.getClass();
                EnumC0892m enumC0892m = EnumC0892m.f8484b;
                Log.d("FirebaseSessions", "Session Event Type: SESSION_START");
                byte[] bytes = strA.getBytes(C2581c.f21468b);
                j.f(bytes, "getBytes(...)");
                return bytes;
            case 18:
                return ((LoanInstance) obj2).lambda$getRemainingDaysUnit$1((String) obj);
            case 25:
                return (Profile) obj2;
            default:
                Voucher voucher = (Voucher) obj;
                c1 c1Var = (c1) obj2;
                VoucherReminder voucherReminderC = c1Var.c(voucher);
                J j = c1Var.c;
                if (voucherReminderC != null) {
                    Voucher voucherBuild = voucher.toBuilder().mHasReminder(voucherReminderC.mHasReminder()).build();
                    j.getClass();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("mechanics", voucherBuild.mMechanics());
                    contentValues.put("faq", voucherBuild.mFaq());
                    contentValues.put("has_reminder", Boolean.valueOf(voucherBuild.mHasReminder()));
                    j.f11302a.e("voucher", contentValues, "code = ?", new String[]{voucherBuild.mCode()});
                } else {
                    ArrayList arrayList = new ArrayList();
                    c1Var.a(voucher.mAssignmentId());
                    arrayList.add(voucher.toBuilder().mStatus("NEW").mPage(1).mHasReminder(false).build());
                    j.f11302a.b("voucher", "status=?", new String[]{"NEW"});
                    j.a(arrayList);
                }
                return voucher;
        }
    }

    @Override // com.google.gson.internal.l
    public Object b() {
        Object obj = this.f8239b;
        switch (this.f8238a) {
            case 16:
                Constructor constructor = (Constructor) obj;
                try {
                    return constructor.newInstance(null);
                } catch (IllegalAccessException e) {
                    qk.i iVar = i3.c.f17096a;
                    throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
                } catch (InstantiationException e7) {
                    throw new RuntimeException("Failed to invoke constructor '" + i3.c.b(constructor) + "' with no args", e7);
                } catch (InvocationTargetException e10) {
                    throw new RuntimeException("Failed to invoke constructor '" + i3.c.b(constructor) + "' with no args", e10.getCause());
                }
            default:
                Class cls = (Class) obj;
                try {
                    return s.f10003a.a(cls);
                } catch (Exception e11) {
                    throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e11);
                }
        }
    }

    @Override // Ah.i
    public void c(C0300e c0300e) {
        switch (this.f8238a) {
            case 10:
                MayaShopProviderProductsListSearchFragment mayaShopProviderProductsListSearchFragment = (MayaShopProviderProductsListSearchFragment) this.f8239b;
                AppCompatEditText appCompatEditText = mayaShopProviderProductsListSearchFragment.f14082W;
                if (appCompatEditText != null) {
                    appCompatEditText.addTextChangedListener(new C0251a(4, mayaShopProviderProductsListSearchFragment, c0300e));
                    return;
                } else {
                    j.n("mSearchView");
                    throw null;
                }
            default:
                MayaShopSearchFragment mayaShopSearchFragment = (MayaShopSearchFragment) this.f8239b;
                AppCompatEditText appCompatEditText2 = mayaShopSearchFragment.f14157V;
                if (appCompatEditText2 != null) {
                    appCompatEditText2.addTextChangedListener(new C0251a(5, mayaShopSearchFragment, c0300e));
                    return;
                } else {
                    j.n("mSearchView");
                    throw null;
                }
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Factory
    public SupportSQLiteOpenHelper create(SupportSQLiteOpenHelper.Configuration configuration) {
        return WorkDatabase.Companion.create$lambda$0((Context) this.f8239b, configuration);
    }

    @Override // G5.t
    public void m(String str, View view) {
        cb.b bVar = ((MayaProminentDisclosureBottomSheetDialogFragment) this.f8239b).f13675V;
        if (bVar != null) {
            bVar.L0();
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.f8238a) {
            case 13:
                A.a((Intent) this.f8239b);
                break;
            case 14:
                ((C) this.f8239b).f9754b.trySetResult(null);
                break;
            default:
                ((ScheduledFuture) this.f8239b).cancel(false);
                break;
        }
    }

    @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
    public void onConfigureTab(TabLayout.Tab tab, int i) {
        List list;
        FavoriteCategory favoriteCategory;
        j.g(tab, "tab");
        U7.c cVar = ((MayaFavoriteFragment) this.f8239b).f12349s0;
        if (cVar == null || (list = cVar.f5958a) == null || (favoriteCategory = (FavoriteCategory) list.get(i)) == null) {
            return;
        }
        String str = favoriteCategory.f12314a;
        tab.setText(str);
        tab.setTag(str);
    }

    @Override // androidx.fragment.app.FragmentResultListener
    public void onFragmentResult(String str, Bundle bundle) {
        switch (this.f8238a) {
            case 7:
                MayaShopPaymentFragment mayaShopPaymentFragment = (MayaShopPaymentFragment) this.f8239b;
                j.g(str, "<unused var>");
                j.g(bundle, "bundle");
                Wb.b bVarY1 = mayaShopPaymentFragment.Y1();
                ContactModel contactModel = (ContactModel) bundle.getParcelable("key_selected_contact_model");
                o oVar = (o) bVarY1;
                if (contactModel != null) {
                    MayaAutoCompleteInputLayout mayaAutoCompleteInputLayoutX1 = ((MayaShopPaymentFragment) ((bc.e) oVar.c.get())).X1();
                    mayaAutoCompleteInputLayoutX1.f11986t = true;
                    mayaAutoCompleteInputLayoutX1.c();
                    bc.e eVar = (bc.e) oVar.c.get();
                    String name = contactModel.getName();
                    String contactNumber = contactModel.getNumber();
                    MayaShopPaymentFragment mayaShopPaymentFragment2 = (MayaShopPaymentFragment) eVar;
                    mayaShopPaymentFragment2.getClass();
                    j.g(contactNumber, "contactNumber");
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(name);
                    sb2.append(" (");
                    String strP = We.s.p(sb2, contactNumber, ")");
                    mayaShopPaymentFragment2.W1().setText(strP);
                    ((o) mayaShopPaymentFragment2.Y1()).s(strP);
                    return;
                }
                return;
            default:
                MayaAddFavoriteFragment mayaAddFavoriteFragment = (MayaAddFavoriteFragment) this.f8239b;
                j.g(str, "<unused var>");
                j.g(bundle, "bundle");
                Integer numValueOf = bundle.containsKey("result_selected_reminder_day") ? Integer.valueOf(bundle.getInt("result_selected_reminder_day")) : null;
                Y7.b bVar = (Y7.b) mayaAddFavoriteFragment.G1();
                if (numValueOf == null) {
                    if (((MayaAddFavoriteFragment) ((InterfaceC1083a) bVar.c.get())).f12336j0 == null) {
                        SwitchCompat switchCompat = ((MayaAddFavoriteFragment) ((InterfaceC1083a) bVar.c.get())).f12327a0;
                        if (switchCompat != null) {
                            switchCompat.setChecked(false);
                            return;
                        } else {
                            j.n("mSwitchToggleReminderDay");
                            throw null;
                        }
                    }
                    return;
                }
                ((MayaAddFavoriteFragment) ((InterfaceC1083a) bVar.c.get())).f12336j0 = numValueOf;
                MayaAddFavoriteFragment mayaAddFavoriteFragment2 = (MayaAddFavoriteFragment) ((InterfaceC1083a) bVar.c.get());
                String strB = AbstractC0617a.B(numValueOf.intValue());
                String string = mayaAddFavoriteFragment2.getString(R.string.maya_format_reminders_ordinal_suffix_every_month, numValueOf, strB);
                j.f(string, "getString(...)");
                int iF = C2576A.F(string, strB, 0, false, 6);
                int length = strB.length() + iF;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                spannableStringBuilder.setSpan(new SuperscriptSpan(), iF, length, 17);
                spannableStringBuilder.setSpan(new RelativeSizeSpan(0.7f), iF, length, 17);
                HtmlTextView htmlTextView = mayaAddFavoriteFragment2.f12329c0;
                if (htmlTextView == null) {
                    j.n("mTextViewReminderChosenDay");
                    throw null;
                }
                htmlTextView.setText(spannableStringBuilder);
                Group group = ((MayaAddFavoriteFragment) ((InterfaceC1083a) bVar.c.get())).f12331e0;
                if (group != null) {
                    group.setVisibility(0);
                    return;
                } else {
                    j.n("mConstraintGroupChosenReminderDaySection");
                    throw null;
                }
        }
    }

    @Override // androidx.core.widget.NestedScrollView.OnScrollChangeListener
    public void onScrollChange(NestedScrollView scrollView, int i, int i4, int i6, int i10) {
        int i11 = 5;
        int i12 = 12;
        int i13 = 2;
        int i14 = 0;
        switch (this.f8238a) {
            case 8:
                MayaShopProviderPageProductsListFragment mayaShopProviderPageProductsListFragment = (MayaShopProviderPageProductsListFragment) this.f8239b;
                j.g(scrollView, "scrollView");
                View childAt = scrollView.getChildAt(scrollView.getChildCount() - 1);
                if (childAt == null || i4 < childAt.getMeasuredHeight() - scrollView.getMeasuredHeight() || i4 <= i10) {
                    return;
                }
                r rVar = (r) mayaShopProviderPageProductsListFragment.P1();
                if (((MayaShopProviderPageProductsListFragment) ((bc.g) rVar.c.get())).u0) {
                    return;
                }
                ((MayaShopProviderPageProductsListFragment) ((bc.g) rVar.c.get())).u0 = true;
                MayaShopProviderPageProductsListFragment mayaShopProviderPageProductsListFragment2 = (MayaShopProviderPageProductsListFragment) ((bc.g) rVar.c.get());
                ac.s sVar = mayaShopProviderPageProductsListFragment2.w0;
                if (sVar == null) {
                    j.n("mProductsAdapter");
                    throw null;
                }
                if (!sVar.f()) {
                    ac.s sVar2 = mayaShopProviderPageProductsListFragment2.w0;
                    if (sVar2 == null) {
                        j.n("mProductsAdapter");
                        throw null;
                    }
                    sVar2.g(true);
                }
                ShopProviderSubcategory shopProviderSubcategory = ((MayaShopProviderPageProductsListFragment) ((bc.g) rVar.c.get())).f14063z0;
                if (shopProviderSubcategory != null) {
                    C1285t0 c1285t0 = rVar.f6590d;
                    String providerName = shopProviderSubcategory.getProviderName();
                    if (providerName == null) {
                        providerName = "";
                    }
                    String code = shopProviderSubcategory.getCode();
                    new T(i11, new Lh.d(new Lh.d(new Lh.h(c1285t0.b(providerName, ((MayaShopProviderPageProductsListFragment) ((bc.g) rVar.c.get())).f14061v0 + 1, code != null ? code : "", false), zh.b.a(), 0), new T3.l(rVar, 9), i13), new Q6.r(rVar, 11), i14), new p(rVar, i13)).e();
                    return;
                }
                ((MayaShopProviderPageProductsListFragment) ((bc.g) rVar.c.get())).u0 = false;
                MayaShopProviderPageProductsListFragment mayaShopProviderPageProductsListFragment3 = (MayaShopProviderPageProductsListFragment) ((bc.g) rVar.c.get());
                ac.s sVar3 = mayaShopProviderPageProductsListFragment3.w0;
                if (sVar3 == null) {
                    j.n("mProductsAdapter");
                    throw null;
                }
                if (sVar3.f()) {
                    ac.s sVar4 = mayaShopProviderPageProductsListFragment3.w0;
                    if (sVar4 != null) {
                        sVar4.g(false);
                        return;
                    } else {
                        j.n("mProductsAdapter");
                        throw null;
                    }
                }
                return;
            default:
                MayaShopProviderProductsListFragment mayaShopProviderProductsListFragment = (MayaShopProviderProductsListFragment) this.f8239b;
                String str = MayaShopProviderProductsListFragment.f14064E0;
                j.g(scrollView, "scrollView");
                View childAt2 = scrollView.getChildAt(scrollView.getChildCount() - 1);
                if (childAt2 == null || i4 < childAt2.getMeasuredHeight() - scrollView.getMeasuredHeight() || i4 <= i10) {
                    return;
                }
                u uVar = (u) mayaShopProviderProductsListFragment.P1();
                if (((MayaShopProviderProductsListFragment) ((bc.h) uVar.c.get())).f14070C0) {
                    return;
                }
                ((MayaShopProviderProductsListFragment) ((bc.h) uVar.c.get())).f14070C0 = true;
                MayaShopProviderProductsListFragment mayaShopProviderProductsListFragment2 = (MayaShopProviderProductsListFragment) ((bc.h) uVar.c.get());
                ac.s sVar5 = mayaShopProviderProductsListFragment2.f14068A0;
                if (sVar5 == null) {
                    j.n("mProductsAdapter");
                    throw null;
                }
                if (!sVar5.f()) {
                    ac.s sVar6 = mayaShopProviderProductsListFragment2.f14068A0;
                    if (sVar6 == null) {
                        j.n("mProductsAdapter");
                        throw null;
                    }
                    sVar6.g(true);
                }
                new T(i11, new Lh.d(new Lh.d(new Lh.h(uVar.f6595d.c(((MayaShopProviderProductsListFragment) ((bc.h) uVar.c.get())).f14079z0 + 1, ((MayaShopProviderProductsListFragment) ((bc.h) uVar.c.get())).Q1().getName(), false), zh.b.a(), 0), new Q6.r(uVar, i12), i13), new Qd.a(uVar, i12), i14), new Xb.s(uVar, i13)).e();
                return;
        }
    }

    @Override // Ch.a
    public void run() {
        switch (this.f8238a) {
            case 2:
                ((MayaBaseFragment) ((ga.c) ((ba.s) this.f8239b).c.get())).w1();
                break;
            case 3:
                ((MayaBaseFragment) ((ga.e) ((ba.C) this.f8239b).c.get())).w1();
                break;
            default:
                MayaPayBillsReceiptFragment mayaPayBillsReceiptFragment = (MayaPayBillsReceiptFragment) ((ga.f) ((D) this.f8239b).c.get());
                FragmentActivity fragmentActivityRequireActivity = mayaPayBillsReceiptFragment.requireActivity();
                x1 x1Var = mayaPayBillsReceiptFragment.f13469v0;
                j.d(x1Var);
                ConstraintLayout constraintLayout = x1Var.f4276a;
                j.f(constraintLayout, "getRoot(...)");
                b0.e(fragmentActivityRequireActivity, constraintLayout, null, R.string.maya_label_update_favorite_success, R.drawable.maya_bg_snackbar_with_border_success, R.style.JekoBoldSmallText_Snackbar_Success, 0, 0, 852);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) throws IOException {
        ((Xh.b) this.f8239b).getClass();
        Bundle bundle = (Bundle) task.getResult(IOException.class);
        if (bundle == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String string = bundle.getString("registration_id");
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString("unregistered");
        if (string2 != null) {
            return string2;
        }
        String string3 = bundle.getString(MediaRouteProviderProtocol.SERVICE_DATA_ERROR);
        if ("RST".equals(string3)) {
            throw new IOException("INSTANCE_ID_RESET");
        }
        if (string3 != null) {
            throw new IOException(string3);
        }
        Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x05d1  */
    @Override // b2.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object v(Xh.b r52) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1651
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.e.v(Xh.b):java.lang.Object");
    }
}
