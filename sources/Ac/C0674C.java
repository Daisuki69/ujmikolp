package ac;

import N5.C0466m;
import N5.H;
import N5.X0;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.camera.video.AudioStats;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import cc.InterfaceC1087A;
import com.paymaya.R;
import com.paymaya.common.exception.PayMayaRuntimeException;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.utility.J;
import com.paymaya.domain.model.Contact;
import com.paymaya.domain.model.DateHeader;
import com.paymaya.domain.model.Dated;
import com.paymaya.domain.model.OrderProviderField;
import com.paymaya.domain.model.ShopPurchaseHistory;
import com.paymaya.mayaui.shop.view.activity.impl.MayaShopV2Activity;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopPurchaseHistoryPageFragment;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopPurchaseHistoryReceiptFragment;
import dOYHB6.tiZVw8.numX49;
import dc.C1350a;
import hd.InterfaceC1561a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import v.AbstractC2329d;
import zj.C2576A;

/* JADX INFO: renamed from: ac.C, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0674C extends RecyclerView.Adapter implements InterfaceC1561a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f7080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.paymaya.data.preference.a f7081b;
    public final MayaShopPurchaseHistoryPageFragment c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LayoutInflater f7082d;
    public boolean e;
    public final ArrayList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f7083g;

    public C0674C(Context context, com.paymaya.data.preference.a aVar, MayaShopPurchaseHistoryPageFragment mayaShopPurchaseHistoryPageFragment) {
        this.f7080a = context;
        this.f7081b = aVar;
        this.c = mayaShopPurchaseHistoryPageFragment;
        Object systemService = context.getSystemService(numX49.tnTj78("buObP"));
        kotlin.jvm.internal.j.e(systemService, numX49.tnTj78("buObb"));
        this.f7082d = (LayoutInflater) systemService;
        this.f = new ArrayList();
    }

    @Override // hd.InterfaceC1561a
    public final boolean a(int i) {
        if (i >= this.f.size()) {
            return false;
        }
        int itemViewType = getItemViewType(i);
        return itemViewType == 0 || itemViewType == 1 || (itemViewType != 2 && itemViewType == 3);
    }

    @Override // hd.InterfaceC1561a
    public final void b(int i, View view) {
        kotlin.jvm.internal.j.g(view, numX49.tnTj78("buOb2"));
        ArrayList arrayList = this.f;
        if (i < arrayList.size()) {
            if (((C0677a) arrayList.get(i)).f7090a instanceof DateHeader) {
                this.f7083g = i;
            }
            View viewFindViewById = view.findViewById(R.id.text_view_date_pma_view_date_header_view_all);
            String strTnTj78 = numX49.tnTj78("buObL");
            kotlin.jvm.internal.j.e(viewFindViewById, strTnTj78);
            TextView textView = (TextView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(R.id.shop_history_price_sum_text_view);
            kotlin.jvm.internal.j.e(viewFindViewById2, strTnTj78);
            TextView textView2 = (TextView) viewFindViewById2;
            int size = arrayList.size();
            double dMPrice = AudioStats.AUDIO_AMPLITUDE_NONE;
            for (int i4 = this.f7083g + 1; i4 < size; i4++) {
                Dated dated = ((C0677a) arrayList.get(i4)).f7090a;
                if (!(dated instanceof ShopPurchaseHistory)) {
                    break;
                }
                dMPrice += ((ShopPurchaseHistory) dated).mPrice();
            }
            String str = String.format(numX49.tnTj78("buObr"), Arrays.copyOf(new Object[]{Double.valueOf(dMPrice)}, 1));
            Dated dated2 = ((C0677a) arrayList.get(this.f7083g)).f7090a;
            kotlin.jvm.internal.j.e(dated2, numX49.tnTj78("buObZ"));
            Context context = this.f7080a;
            textView.setText(((DateHeader) dated2).getMayaLocalDateTimeForDateHeader(context.getResources().getConfiguration().locale));
            textView2.setText(context.getString(R.string.maya_shop_history_price_format, str));
        }
    }

    @Override // hd.InterfaceC1561a
    public final boolean c(int i) {
        return i < getItemCount() && getItemViewType(i) == 3;
    }

    public final void e(ShopPurchaseHistory shopPurchaseHistory) {
        kotlin.jvm.internal.j.g(shopPurchaseHistory, numX49.tnTj78("buObk"));
        MayaShopPurchaseHistoryPageFragment mayaShopPurchaseHistoryPageFragment = this.c;
        mayaShopPurchaseHistoryPageFragment.getClass();
        if (mayaShopPurchaseHistoryPageFragment.t1().e().isShopEventsV2Enabled()) {
            C1219h c1219hE = C1219h.e(AbstractC1213b.q(9));
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            c1219hE.j.put(numX49.tnTj78("buObB"), shopPurchaseHistory.mStatus());
            c1219hE.j.put(numX49.tnTj78("buObu"), String.valueOf(shopPurchaseHistory.mPrice()));
            c1219hE.j.put(numX49.tnTj78("buObV"), shopPurchaseHistory.mProductName());
            EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
            String strMNetwork = shopPurchaseHistory.mNetwork();
            if (strMNetwork != null) {
                c1219hE.j.put(numX49.tnTj78("buObS"), strMNetwork);
            }
            mayaShopPurchaseHistoryPageFragment.o1().b(c1219hE);
        } else {
            C1219h c1219hH = AbstractC2329d.h(17);
            c1219hH.t(EnumC1217f.PRODUCT);
            mayaShopPurchaseHistoryPageFragment.A1(c1219hH);
        }
        InterfaceC1087A interfaceC1087A = mayaShopPurchaseHistoryPageFragment.t0;
        if (interfaceC1087A != null) {
            MayaShopV2Activity mayaShopV2Activity = (MayaShopV2Activity) ((Yb.b) ((MayaShopV2Activity) interfaceC1087A).V1().c.get());
            mayaShopV2Activity.getClass();
            MayaShopPurchaseHistoryReceiptFragment mayaShopPurchaseHistoryReceiptFragment = new MayaShopPurchaseHistoryReceiptFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable(numX49.tnTj78("buObj"), shopPurchaseHistory);
            mayaShopPurchaseHistoryReceiptFragment.setArguments(bundle);
            AbstractC1236z.h(mayaShopV2Activity, R.id.frame_layout_fragment_container, mayaShopPurchaseHistoryReceiptFragment);
        }
    }

    public final void f(boolean z4) {
        if (z4 && !z4) {
            this.e = true;
            notifyItemInserted(getItemCount());
        } else {
            if (z4 || !z4) {
                return;
            }
            this.e = false;
            notifyItemRemoved(getItemCount() + 1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f.size() + (this.e ? 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        if (this.e && i == getItemCount() - 1) {
            return 2;
        }
        Dated dated = ((C0677a) this.f.get(i)).f7090a;
        if (dated instanceof ShopPurchaseHistory) {
            return kotlin.jvm.internal.j.b(((ShopPurchaseHistory) dated).mStatus(), numX49.tnTj78("buObd")) ? 1 : 0;
        }
        if (dated instanceof DateHeader) {
            return 3;
        }
        throw new PayMayaRuntimeException(We.s.f(i, numX49.tnTj78("buObi")));
    }

    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v28 */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        ShopPurchaseHistory shopPurchaseHistory;
        boolean z4;
        ?? r32;
        String strMRecipient;
        String strMRecipient2;
        String strMRecipient3;
        String strMRecipient4;
        kotlin.jvm.internal.j.g(viewHolder, numX49.tnTj78("buObE"));
        int itemViewType = getItemViewType(i);
        ArrayList arrayList = this.f;
        String strTnTj78 = numX49.tnTj78("buObF");
        String strTnTj782 = numX49.tnTj78("buObH");
        String strTnTj783 = numX49.tnTj78("buObO");
        String strTnTj784 = numX49.tnTj78("buObQ");
        String strTnTj785 = numX49.tnTj78("buObt");
        String strTnTj786 = numX49.tnTj78("buObU");
        ArrayList<OrderProviderField> arrayList2 = null;
        ArrayList<OrderProviderField> arrayList3 = null;
        if (itemViewType != 0) {
            if (itemViewType != 1) {
                if (itemViewType != 3) {
                    return;
                }
                C1350a c1350a = (C1350a) viewHolder;
                kotlin.jvm.internal.j.g(arrayList, numX49.tnTj78("buObe"));
                Dated dated = ((C0677a) arrayList.get(i)).f7090a;
                DateHeader dateHeader = dated instanceof DateHeader ? (DateHeader) dated : null;
                if (dateHeader != null) {
                    Context context = this.f7080a;
                    kotlin.jvm.internal.j.d(context);
                    Locale locale = context.getResources().getConfiguration().locale;
                    kotlin.jvm.internal.j.f(locale, numX49.tnTj78("buOb8"));
                    String mayaLocalDateTimeForDateHeader = dateHeader.getMayaLocalDateTimeForDateHeader(locale);
                    int size = arrayList.size();
                    double dMPrice = AudioStats.AUDIO_AMPLITUDE_NONE;
                    for (int i4 = i + 1; i4 < size; i4++) {
                        Dated dated2 = ((C0677a) arrayList.get(i4)).f7090a;
                        if (!(dated2 instanceof ShopPurchaseHistory)) {
                            break;
                        }
                        dMPrice += ((ShopPurchaseHistory) dated2).mPrice();
                    }
                    String str = String.format(numX49.tnTj78("buObC"), Arrays.copyOf(new Object[]{Double.valueOf(dMPrice)}, 1));
                    Q6.s sVar = c1350a.c;
                    sVar.getClass();
                    C1350a c1350a2 = (C1350a) sVar.f5293b;
                    if (mayaLocalDateTimeForDateHeader != null) {
                        c1350a2.f16303a.setText(mayaLocalDateTimeForDateHeader);
                    }
                    TextView textView = c1350a2.f16304b;
                    textView.setText(textView.getContext().getString(R.string.maya_shop_history_price_format, str));
                    return;
                }
                return;
            }
            Dated dated3 = ((C0677a) arrayList.get(i)).f7090a;
            kotlin.jvm.internal.j.e(dated3, strTnTj786);
            ShopPurchaseHistory shopPurchaseHistory2 = (ShopPurchaseHistory) dated3;
            dc.p pVar = (dc.p) viewHolder;
            pVar.j = shopPurchaseHistory2;
            Q6.n nVar = pVar.i;
            nVar.getClass();
            String strMProductName = shopPurchaseHistory2.mProductName();
            String str2 = strMProductName == null ? strTnTj785 : strMProductName;
            dc.p pVar2 = (dc.p) nVar.f5284b;
            pVar2.f16352d.setText(str2);
            String strMProductDescription = shopPurchaseHistory2.mProductDescription();
            if (strMProductDescription == null) {
                strMProductDescription = strTnTj785;
            }
            TextView textView2 = pVar2.e;
            textView2.setText(strMProductDescription);
            String str3 = J.f10420a.format(shopPurchaseHistory2.mPrice());
            kotlin.jvm.internal.j.f(str3, strTnTj784);
            TextView textView3 = pVar2.f16353g;
            textView3.setText(textView3.getContext().getString(R.string.maya_shop_history_price_format, str3));
            String strMImageUrl = shopPurchaseHistory2.mImageUrl();
            if (strMImageUrl == null) {
                strMImageUrl = strTnTj785;
            }
            pVar2.itemView.getContext();
            com.paymaya.common.utility.C.e0(strMImageUrl, pVar2.c, 2131232014);
            String strMProductDescription2 = shopPurchaseHistory2.mProductDescription();
            if (strMProductDescription2 == null || strMProductDescription2.length() == 0) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
            }
            boolean zMIsGifted = shopPurchaseHistory2.mIsGifted();
            TextView textView4 = pVar2.f;
            if (!zMIsGifted || (strMRecipient3 = shopPurchaseHistory2.mRecipient()) == null || C2576A.H(strMRecipient3)) {
                textView4.setVisibility(8);
            } else {
                Contact contactC = J5.c.d().c(shopPurchaseHistory2.mRecipient());
                if ((contactC != null && (strMRecipient4 = contactC.mName()) != null) || (strMRecipient4 = shopPurchaseHistory2.mRecipient()) != null) {
                    strTnTj785 = strMRecipient4;
                }
                textView4.setText(strTnTj785);
                textView4.setVisibility(0);
            }
            boolean zEqualsIgnoreCase = strTnTj783.equalsIgnoreCase(shopPurchaseHistory2.mNetwork());
            LinearLayout linearLayout = pVar2.h;
            if (zEqualsIgnoreCase || strTnTj782.equalsIgnoreCase(shopPurchaseHistory2.mNetwork())) {
                HashMap map = new HashMap();
                map.put(strTnTj78, shopPurchaseHistory2.mRecipient());
                pVar2.D(map);
                linearLayout.setVisibility(0);
            } else {
                List<OrderProviderField> listMOtherFields = shopPurchaseHistory2.mOtherFields();
                if (listMOtherFields != null) {
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj : listMOtherFields) {
                        if (!kotlin.jvm.internal.j.b(((OrderProviderField) obj).mIsHidden(), Boolean.TRUE)) {
                            arrayList4.add(obj);
                        }
                    }
                    arrayList3 = arrayList4;
                }
                if (arrayList3 == null || arrayList3.isEmpty()) {
                    linearLayout.setVisibility(8);
                } else {
                    HashMap map2 = new HashMap();
                    for (OrderProviderField orderProviderField : arrayList3) {
                        map2.put(orderProviderField.mName(), orderProviderField.mValue());
                    }
                    pVar2.D(map2);
                    linearLayout.setVisibility(0);
                }
            }
            int i6 = i + 1;
            boolean z5 = arrayList.size() == i6 || (arrayList.size() > i6 && (((C0677a) arrayList.get(i6)).f7090a instanceof DateHeader));
            ConstraintLayout constraintLayout = pVar.f16351b;
            if (z5) {
                constraintLayout.setBackground(ContextCompat.getDrawable(pVar.itemView.getContext(), R.drawable.maya_bg_shop_history_last));
                return;
            } else {
                constraintLayout.setBackground(ContextCompat.getDrawable(pVar.itemView.getContext(), R.drawable.maya_bg_shop_history));
                return;
            }
        }
        Dated dated4 = ((C0677a) arrayList.get(i)).f7090a;
        kotlin.jvm.internal.j.e(dated4, strTnTj786);
        ShopPurchaseHistory shopPurchaseHistory3 = (ShopPurchaseHistory) dated4;
        dc.o oVar = (dc.o) viewHolder;
        oVar.f16349n = shopPurchaseHistory3;
        Lh.c cVar = oVar.m;
        cVar.getClass();
        String strMProductName2 = shopPurchaseHistory3.mProductName();
        if (strMProductName2 == null) {
            strMProductName2 = strTnTj785;
        }
        dc.o oVar2 = (dc.o) cVar.c;
        oVar2.f16345d.setText(strMProductName2);
        String strMProductDescription3 = shopPurchaseHistory3.mProductDescription();
        if (strMProductDescription3 == null) {
            strMProductDescription3 = strTnTj785;
        }
        TextView textView5 = oVar2.e;
        textView5.setText(strMProductDescription3);
        String str4 = J.f10420a.format(shopPurchaseHistory3.mPrice());
        kotlin.jvm.internal.j.f(str4, strTnTj784);
        TextView textView6 = oVar2.f;
        textView6.setText(textView6.getContext().getString(R.string.maya_shop_history_price_format, str4));
        String strMImageUrl2 = shopPurchaseHistory3.mImageUrl();
        if (strMImageUrl2 == null) {
            strMImageUrl2 = strTnTj785;
        }
        oVar2.itemView.getContext();
        com.paymaya.common.utility.C.e0(strMImageUrl2, oVar2.c, 2131232014);
        String strMProductDescription4 = shopPurchaseHistory3.mProductDescription();
        if (strMProductDescription4 == null || strMProductDescription4.length() == 0) {
            textView5.setVisibility(8);
        } else {
            textView5.setVisibility(0);
        }
        boolean zMIsGifted2 = shopPurchaseHistory3.mIsGifted();
        TextView textView7 = oVar2.f16346g;
        if (!zMIsGifted2 || (strMRecipient = shopPurchaseHistory3.mRecipient()) == null || C2576A.H(strMRecipient)) {
            textView7.setVisibility(8);
        } else {
            Contact contactC2 = J5.c.d().c(shopPurchaseHistory3.mRecipient());
            if ((contactC2 == null || (strMRecipient2 = contactC2.mName()) == null) && (strMRecipient2 = shopPurchaseHistory3.mRecipient()) == null) {
                strMRecipient2 = strTnTj785;
            }
            textView7.setText(strMRecipient2);
            textView7.setVisibility(0);
        }
        String strMCode = shopPurchaseHistory3.mCode();
        Group group = oVar2.f16348l;
        Group group2 = oVar2.f16347k;
        if (strMCode == null || C2576A.H(strMCode)) {
            shopPurchaseHistory = shopPurchaseHistory3;
            group2.setVisibility(8);
            group.setVisibility(8);
        } else {
            String strMNetwork = shopPurchaseHistory3.mNetwork();
            Iterator<String> it = ((com.paymaya.data.preference.a) cVar.f2990b).e().mShopConfig().mTreatsNetworks().iterator();
            while (true) {
                if (it.hasNext()) {
                    String next = it.next();
                    kotlin.jvm.internal.j.d(next);
                    int length = next.length() - 1;
                    int i10 = 0;
                    boolean z8 = false;
                    while (true) {
                        if (i10 > length) {
                            shopPurchaseHistory = shopPurchaseHistory3;
                            r32 = 1;
                            break;
                        }
                        shopPurchaseHistory = shopPurchaseHistory3;
                        boolean z9 = kotlin.jvm.internal.j.i(next.charAt(!z8 ? i10 : length), 32) <= 0;
                        if (z8) {
                            r32 = 1;
                            if (!z9) {
                                break;
                            } else {
                                length--;
                            }
                        } else if (z9) {
                            i10++;
                        } else {
                            shopPurchaseHistory3 = shopPurchaseHistory;
                            z8 = true;
                        }
                        shopPurchaseHistory3 = shopPurchaseHistory;
                    }
                    if (zj.z.o(next.subSequence(i10, length + r32).toString(), strMNetwork, r32)) {
                        group2.setVisibility(8);
                        group.setVisibility(0);
                        String strMCode2 = shopPurchaseHistory.mCode();
                        if (strMCode2 != null) {
                            strTnTj785 = strMCode2;
                        }
                        oVar2.i.setText(strTnTj785);
                    } else {
                        shopPurchaseHistory3 = shopPurchaseHistory;
                    }
                } else {
                    shopPurchaseHistory = shopPurchaseHistory3;
                    group2.setVisibility(0);
                    group.setVisibility(8);
                    String strMCode3 = shopPurchaseHistory.mCode();
                    if (strMCode3 != null) {
                        strTnTj785 = strMCode3;
                    }
                    oVar2.h.setText(strTnTj785);
                }
            }
        }
        boolean zEqualsIgnoreCase2 = strTnTj783.equalsIgnoreCase(shopPurchaseHistory.mNetwork());
        LinearLayout linearLayout2 = oVar2.j;
        if (zEqualsIgnoreCase2 || strTnTj782.equalsIgnoreCase(shopPurchaseHistory.mNetwork())) {
            HashMap map3 = new HashMap();
            map3.put(strTnTj78, shopPurchaseHistory.mRecipient());
            oVar2.D(map3);
            z4 = false;
            linearLayout2.setVisibility(0);
        } else {
            List<OrderProviderField> listMOtherFields2 = shopPurchaseHistory.mOtherFields();
            if (listMOtherFields2 != null) {
                ArrayList arrayList5 = new ArrayList();
                for (Object obj2 : listMOtherFields2) {
                    if (!kotlin.jvm.internal.j.b(((OrderProviderField) obj2).mIsHidden(), Boolean.TRUE)) {
                        arrayList5.add(obj2);
                    }
                }
                arrayList2 = arrayList5;
            }
            if (arrayList2 == null || arrayList2.isEmpty()) {
                linearLayout2.setVisibility(8);
            } else {
                HashMap map4 = new HashMap();
                for (OrderProviderField orderProviderField2 : arrayList2) {
                    map4.put(orderProviderField2.mName(), orderProviderField2.mValue());
                }
                oVar2.D(map4);
                linearLayout2.setVisibility(0);
            }
            z4 = false;
        }
        int i11 = i + 1;
        if (arrayList.size() == i11 || (arrayList.size() > i11 && (((C0677a) arrayList.get(i11)).f7090a instanceof DateHeader))) {
            z4 = true;
        }
        ConstraintLayout constraintLayout2 = oVar.f16344b;
        if (z4) {
            constraintLayout2.setBackground(ContextCompat.getDrawable(oVar.itemView.getContext(), R.drawable.maya_bg_shop_history_last));
        } else {
            constraintLayout2.setBackground(ContextCompat.getDrawable(oVar.itemView.getContext(), R.drawable.maya_bg_shop_history));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        kotlin.jvm.internal.j.g(viewGroup, numX49.tnTj78("buOb4"));
        com.paymaya.data.preference.a aVar = this.f7081b;
        String strTnTj78 = numX49.tnTj78("buObo");
        LayoutInflater layoutInflater = this.f7082d;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return new C0673B(layoutInflater.inflate(R.layout.pma_view_loading, viewGroup, false));
                }
                if (i != 3) {
                    throw new PayMayaRuntimeException(We.s.f(i, numX49.tnTj78("buObK")));
                }
                View viewInflate = layoutInflater.inflate(R.layout.maya_view_date_header_view_all, viewGroup, false);
                int i4 = R.id.shop_history_price_sum_text_view;
                TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.shop_history_price_sum_text_view);
                if (textView != null) {
                    i4 = R.id.text_view_date_pma_view_date_header_view_all;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_date_pma_view_date_header_view_all);
                    if (textView2 != null) {
                        return new C1350a(new X0((LinearLayout) viewInflate, textView, textView2, 1), this.c);
                    }
                }
                throw new NullPointerException(strTnTj78.concat(viewInflate.getResources().getResourceName(i4)));
            }
            View viewInflate2 = layoutInflater.inflate(R.layout.maya_view_shop_purchase_history_processing_item, viewGroup, false);
            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate2;
            int i6 = R.id.shop_history_processing_dynamic_fields_container_linear_layout;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(viewInflate2, R.id.shop_history_processing_dynamic_fields_container_linear_layout);
            if (linearLayout != null) {
                i6 = R.id.shop_history_processing_gifted_recipient_text_view;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate2, R.id.shop_history_processing_gifted_recipient_text_view);
                if (textView3 != null) {
                    i6 = R.id.shop_history_processing_product_description_text_view;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate2, R.id.shop_history_processing_product_description_text_view);
                    if (textView4 != null) {
                        i6 = R.id.shop_history_processing_product_icon_image_view;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate2, R.id.shop_history_processing_product_icon_image_view);
                        if (imageView != null) {
                            i6 = R.id.shop_history_processing_product_name_text_view;
                            TextView textView5 = (TextView) ViewBindings.findChildViewById(viewInflate2, R.id.shop_history_processing_product_name_text_view);
                            if (textView5 != null) {
                                i6 = R.id.shop_history_processing_product_price_text_view;
                                TextView textView6 = (TextView) ViewBindings.findChildViewById(viewInflate2, R.id.shop_history_processing_product_price_text_view);
                                if (textView6 != null) {
                                    i6 = R.id.shop_history_product_icon_guideline;
                                    if (((Guideline) ViewBindings.findChildViewById(viewInflate2, R.id.shop_history_product_icon_guideline)) != null) {
                                        return new dc.p(new C0466m((ViewGroup) constraintLayout, (Object) constraintLayout, (View) linearLayout, (Object) textView3, (Object) textView4, (Object) imageView, (View) textView5, (View) textView6, 23), aVar, this);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            throw new NullPointerException(strTnTj78.concat(viewInflate2.getResources().getResourceName(i6)));
        }
        View viewInflate3 = layoutInflater.inflate(R.layout.maya_view_shop_purchase_history_completed_item, viewGroup, false);
        int i10 = R.id.gifted_recipient_text_view;
        TextView textView7 = (TextView) ViewBindings.findChildViewById(viewInflate3, R.id.gifted_recipient_text_view);
        if (textView7 != null) {
            ConstraintLayout constraintLayout2 = (ConstraintLayout) viewInflate3;
            i10 = R.id.shop_history_completed_dynamic_fields_container_linear_layout;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(viewInflate3, R.id.shop_history_completed_dynamic_fields_container_linear_layout);
            if (linearLayout2 != null) {
                i10 = R.id.shop_history_completed_gaming_pin_background_view;
                View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate3, R.id.shop_history_completed_gaming_pin_background_view);
                if (viewFindChildViewById != null) {
                    i10 = R.id.shop_history_completed_gaming_pin_bottom_space;
                    if (((Space) ViewBindings.findChildViewById(viewInflate3, R.id.shop_history_completed_gaming_pin_bottom_space)) != null) {
                        i10 = R.id.shop_history_completed_gaming_pin_code_label_text_view;
                        if (((TextView) ViewBindings.findChildViewById(viewInflate3, R.id.shop_history_completed_gaming_pin_code_label_text_view)) != null) {
                            i10 = R.id.shop_history_completed_gaming_pin_code_value_text_view;
                            TextView textView8 = (TextView) ViewBindings.findChildViewById(viewInflate3, R.id.shop_history_completed_gaming_pin_code_value_text_view);
                            if (textView8 != null) {
                                i10 = R.id.shop_history_completed_gaming_pin_constraint_group;
                                Group group = (Group) ViewBindings.findChildViewById(viewInflate3, R.id.shop_history_completed_gaming_pin_constraint_group);
                                if (group != null) {
                                    i10 = R.id.shop_history_completed_gaming_pin_copy_image_view;
                                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(viewInflate3, R.id.shop_history_completed_gaming_pin_copy_image_view);
                                    if (imageView2 != null) {
                                        i10 = R.id.shop_history_completed_product_description_text_view;
                                        TextView textView9 = (TextView) ViewBindings.findChildViewById(viewInflate3, R.id.shop_history_completed_product_description_text_view);
                                        if (textView9 != null) {
                                            i10 = R.id.shop_history_completed_product_icon_image_view;
                                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(viewInflate3, R.id.shop_history_completed_product_icon_image_view);
                                            if (imageView3 != null) {
                                                i10 = R.id.shop_history_completed_product_name_text_view;
                                                TextView textView10 = (TextView) ViewBindings.findChildViewById(viewInflate3, R.id.shop_history_completed_product_name_text_view);
                                                if (textView10 != null) {
                                                    i10 = R.id.shop_history_completed_product_price_text_view;
                                                    TextView textView11 = (TextView) ViewBindings.findChildViewById(viewInflate3, R.id.shop_history_completed_product_price_text_view);
                                                    if (textView11 != null) {
                                                        i10 = R.id.shop_history_completed_treat_copy_image_view;
                                                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(viewInflate3, R.id.shop_history_completed_treat_copy_image_view);
                                                        if (imageView4 != null) {
                                                            i10 = R.id.shop_history_completed_treats_background_view;
                                                            View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate3, R.id.shop_history_completed_treats_background_view);
                                                            if (viewFindChildViewById2 != null) {
                                                                i10 = R.id.shop_history_completed_treats_bottom_space;
                                                                if (((Space) ViewBindings.findChildViewById(viewInflate3, R.id.shop_history_completed_treats_bottom_space)) != null) {
                                                                    i10 = R.id.shop_history_completed_treats_code_label_text_view;
                                                                    if (((TextView) ViewBindings.findChildViewById(viewInflate3, R.id.shop_history_completed_treats_code_label_text_view)) != null) {
                                                                        i10 = R.id.shop_history_completed_treats_code_value_text_view;
                                                                        TextView textView12 = (TextView) ViewBindings.findChildViewById(viewInflate3, R.id.shop_history_completed_treats_code_value_text_view);
                                                                        if (textView12 != null) {
                                                                            i10 = R.id.shop_history_completed_treats_constraint_group;
                                                                            Group group2 = (Group) ViewBindings.findChildViewById(viewInflate3, R.id.shop_history_completed_treats_constraint_group);
                                                                            if (group2 != null) {
                                                                                i10 = R.id.shop_history_gaming_pin_guideline;
                                                                                if (((Guideline) ViewBindings.findChildViewById(viewInflate3, R.id.shop_history_gaming_pin_guideline)) != null) {
                                                                                    return new dc.o(new H(constraintLayout2, textView7, constraintLayout2, linearLayout2, viewFindChildViewById, textView8, group, imageView2, textView9, imageView3, textView10, textView11, imageView4, viewFindChildViewById2, textView12, group2), aVar, this);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException(strTnTj78.concat(viewInflate3.getResources().getResourceName(i10)));
    }
}
