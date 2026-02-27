package ue;

import N5.C0466m;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import butterknife.ButterKnife;
import com.paymaya.R;
import com.paymaya.common.exception.PayMayaRuntimeException;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.utility.J;
import com.paymaya.domain.model.Contact;
import com.paymaya.domain.model.DateHeader;
import com.paymaya.domain.model.Dated;
import com.paymaya.domain.model.OrderProviderField;
import com.paymaya.domain.model.ShopPurchaseHistory;
import com.paymaya.domain.store.M;
import com.paymaya.ui.dashboard.view.viewholder.impl.DateHeaderTransactionViewHolder;
import com.paymaya.ui.shopv3.view.activity.impl.ShopV3Activity;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3PurchaseHistoryPageFragment;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3PurchaseHistoryReceiptFragment;
import dOYHB6.tiZVw8.numX49;
import hd.InterfaceC1561a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import pg.C2038a;
import we.InterfaceC2403H;
import zj.C2576A;

/* JADX INFO: loaded from: classes11.dex */
public final class x extends RecyclerView.Adapter implements InterfaceC1561a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f20316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.paymaya.data.preference.a f20317b;
    public final ShopV3PurchaseHistoryPageFragment c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LayoutInflater f20318d;
    public boolean e;
    public final ArrayList f;

    public x(Context context, com.paymaya.data.preference.a aVar, ShopV3PurchaseHistoryPageFragment shopV3PurchaseHistoryPageFragment) {
        kotlin.jvm.internal.j.g(aVar, numX49.tnTj78("bFlF"));
        this.f20316a = context;
        this.f20317b = aVar;
        this.c = shopV3PurchaseHistoryPageFragment;
        Object systemService = context.getSystemService(numX49.tnTj78("bFlH"));
        kotlin.jvm.internal.j.e(systemService, numX49.tnTj78("bFlO"));
        this.f20318d = (LayoutInflater) systemService;
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
        kotlin.jvm.internal.j.g(view, numX49.tnTj78("bFlQ"));
        ArrayList arrayList = this.f;
        if (i < arrayList.size()) {
            View viewFindViewById = view.findViewById(R.id.text_view_date_pma_view_date_header_view_all);
            kotlin.jvm.internal.j.e(viewFindViewById, numX49.tnTj78("bFlt"));
            ((TextView) viewFindViewById).setText(((Dated) arrayList.get(i)).getLocalDateTimeForDateHeader(this.f20316a.getResources().getConfiguration().locale));
        }
    }

    @Override // hd.InterfaceC1561a
    public final boolean c(int i) {
        return i < getItemCount() && getItemViewType(i) == 3;
    }

    public final void e(ShopPurchaseHistory shopPurchaseHistory) {
        kotlin.jvm.internal.j.g(shopPurchaseHistory, numX49.tnTj78("bFlU"));
        ShopV3PurchaseHistoryPageFragment shopV3PurchaseHistoryPageFragment = this.c;
        shopV3PurchaseHistoryPageFragment.getClass();
        C1219h c1219h = new C1219h();
        c1219h.n(17);
        c1219h.t(EnumC1217f.PRODUCT);
        shopV3PurchaseHistoryPageFragment.o1(c1219h);
        InterfaceC2403H interfaceC2403H = shopV3PurchaseHistoryPageFragment.f14871g0;
        if (interfaceC2403H != null) {
            Bundle bundle = new Bundle();
            bundle.putParcelable(numX49.tnTj78("bFle"), shopPurchaseHistory);
            ShopV3PurchaseHistoryReceiptFragment shopV3PurchaseHistoryReceiptFragment = new ShopV3PurchaseHistoryReceiptFragment();
            shopV3PurchaseHistoryReceiptFragment.setArguments(bundle);
            AbstractC1236z.h((ShopV3Activity) interfaceC2403H, R.id.pma_activity_shop_v3_fragment_container, shopV3PurchaseHistoryReceiptFragment);
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
        Dated dated = (Dated) this.f.get(i);
        if (dated instanceof ShopPurchaseHistory) {
            return kotlin.jvm.internal.j.b(((ShopPurchaseHistory) dated).mStatus(), numX49.tnTj78("bFl8")) ? 1 : 0;
        }
        if (dated instanceof DateHeader) {
            return 3;
        }
        throw new PayMayaRuntimeException(We.s.f(i, numX49.tnTj78("bFlC")));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        ArrayList<OrderProviderField> arrayList;
        String strMRecipient;
        String strMRecipient2;
        ArrayList<OrderProviderField> arrayList2;
        String strMRecipient3;
        String strMRecipient4;
        kotlin.jvm.internal.j.g(viewHolder, numX49.tnTj78("bFl4"));
        int itemViewType = getItemViewType(i);
        ArrayList arrayList3 = this.f;
        String strTnTj78 = numX49.tnTj78("bFlo");
        String strTnTj782 = numX49.tnTj78("bFlK");
        String strTnTj783 = numX49.tnTj78("bFlw");
        String strTnTj784 = numX49.tnTj78("bFlc");
        String strTnTj785 = numX49.tnTj78("bFlm");
        String strTnTj786 = numX49.tnTj78("bFlD");
        String strTnTj787 = numX49.tnTj78("bFlh");
        if (itemViewType != 0) {
            if (itemViewType != 1) {
                if (itemViewType != 3) {
                    return;
                }
                DateHeaderTransactionViewHolder dateHeaderTransactionViewHolder = (DateHeaderTransactionViewHolder) viewHolder;
                dateHeaderTransactionViewHolder.f14470b = this.f20316a;
                ((DateHeaderTransactionViewHolder) dateHeaderTransactionViewHolder.f14469a.f11371b).D(((Dated) arrayList3.get(i)).getLocalDateTimeForDisplay(dateHeaderTransactionViewHolder.f14470b.getResources().getConfiguration().locale));
                return;
            }
            Object obj = arrayList3.get(i);
            kotlin.jvm.internal.j.e(obj, strTnTj787);
            ShopPurchaseHistory shopPurchaseHistory = (ShopPurchaseHistory) obj;
            xe.l lVar = (xe.l) viewHolder;
            lVar.j = shopPurchaseHistory;
            o6.f fVar = lVar.i;
            fVar.getClass();
            String strMProductName = shopPurchaseHistory.mProductName();
            if (strMProductName == null) {
                strMProductName = strTnTj786;
            }
            xe.l lVar2 = (xe.l) fVar.f18793b;
            lVar2.c.setText(strMProductName);
            String strMProductDescription = shopPurchaseHistory.mProductDescription();
            if (strMProductDescription == null) {
                strMProductDescription = strTnTj786;
            }
            TextView textView = lVar2.f20977d;
            textView.setText(strMProductDescription);
            String str = strTnTj785 + J.f10420a.format(shopPurchaseHistory.mPrice());
            kotlin.jvm.internal.j.g(str, strTnTj784);
            lVar2.e.setText(str);
            String strMImageUrl = shopPurchaseHistory.mImageUrl();
            if (strMImageUrl == null) {
                strMImageUrl = strTnTj786;
            }
            lVar2.itemView.getContext();
            C.e0(strMImageUrl, lVar2.f20976b, 2131232014);
            String strMProductDescription2 = shopPurchaseHistory.mProductDescription();
            if (strMProductDescription2 == null || strMProductDescription2.length() == 0) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
            }
            boolean zMIsGifted = shopPurchaseHistory.mIsGifted();
            Group group = lVar2.f20978g;
            if (!zMIsGifted || (strMRecipient3 = shopPurchaseHistory.mRecipient()) == null || C2576A.H(strMRecipient3)) {
                group.setVisibility(8);
            } else {
                Contact contactC = J5.c.d().c(shopPurchaseHistory.mRecipient());
                if ((contactC != null && (strMRecipient4 = contactC.mName()) != null) || (strMRecipient4 = shopPurchaseHistory.mRecipient()) != null) {
                    strTnTj786 = strMRecipient4;
                }
                lVar2.f.setText(strTnTj786);
                group.setVisibility(0);
            }
            boolean zEqualsIgnoreCase = strTnTj783.equalsIgnoreCase(shopPurchaseHistory.mNetwork());
            LinearLayout linearLayout = lVar2.h;
            if (zEqualsIgnoreCase || strTnTj782.equalsIgnoreCase(shopPurchaseHistory.mNetwork())) {
                HashMap map = new HashMap();
                map.put(strTnTj78, shopPurchaseHistory.mRecipient());
                lVar2.D(map);
                linearLayout.setVisibility(0);
                return;
            }
            List<OrderProviderField> listMOtherFields = shopPurchaseHistory.mOtherFields();
            if (listMOtherFields != null) {
                arrayList2 = new ArrayList();
                for (Object obj2 : listMOtherFields) {
                    if (!kotlin.jvm.internal.j.b(((OrderProviderField) obj2).mIsHidden(), Boolean.TRUE)) {
                        arrayList2.add(obj2);
                    }
                }
            } else {
                arrayList2 = null;
            }
            if (arrayList2 == null || arrayList2.isEmpty()) {
                linearLayout.setVisibility(8);
                return;
            }
            HashMap map2 = new HashMap();
            for (OrderProviderField orderProviderField : arrayList2) {
                map2.put(orderProviderField.mName(), orderProviderField.mValue());
            }
            lVar2.D(map2);
            linearLayout.setVisibility(0);
            return;
        }
        Object obj3 = arrayList3.get(i);
        kotlin.jvm.internal.j.e(obj3, strTnTj787);
        ShopPurchaseHistory shopPurchaseHistory2 = (ShopPurchaseHistory) obj3;
        xe.k kVar = (xe.k) viewHolder;
        kVar.f20974n = shopPurchaseHistory2;
        C2038a c2038a = kVar.m;
        c2038a.getClass();
        String strMProductName2 = shopPurchaseHistory2.mProductName();
        if (strMProductName2 == null) {
            strMProductName2 = strTnTj786;
        }
        xe.k kVar2 = (xe.k) c2038a.c;
        kVar2.c.setText(strMProductName2);
        String strMProductDescription3 = shopPurchaseHistory2.mProductDescription();
        if (strMProductDescription3 == null) {
            strMProductDescription3 = strTnTj786;
        }
        TextView textView2 = kVar2.f20970d;
        textView2.setText(strMProductDescription3);
        boolean z4 = true;
        String str2 = strTnTj785 + J.f10420a.format(shopPurchaseHistory2.mPrice());
        kotlin.jvm.internal.j.g(str2, strTnTj784);
        kVar2.e.setText(str2);
        String strMImageUrl2 = shopPurchaseHistory2.mImageUrl();
        if (strMImageUrl2 == null) {
            strMImageUrl2 = strTnTj786;
        }
        kVar2.itemView.getContext();
        C.e0(strMImageUrl2, kVar2.f20969b, 2131232014);
        String strMProductDescription4 = shopPurchaseHistory2.mProductDescription();
        if (strMProductDescription4 == null || strMProductDescription4.length() == 0) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
        }
        boolean zMIsGifted2 = shopPurchaseHistory2.mIsGifted();
        Group group2 = kVar2.j;
        if (!zMIsGifted2 || (strMRecipient = shopPurchaseHistory2.mRecipient()) == null || C2576A.H(strMRecipient)) {
            group2.setVisibility(8);
        } else {
            Contact contactC2 = J5.c.d().c(shopPurchaseHistory2.mRecipient());
            if ((contactC2 == null || (strMRecipient2 = contactC2.mName()) == null) && (strMRecipient2 = shopPurchaseHistory2.mRecipient()) == null) {
                strMRecipient2 = strTnTj786;
            }
            kVar2.f.setText(strMRecipient2);
            group2.setVisibility(0);
        }
        String strMCode = shopPurchaseHistory2.mCode();
        Group group3 = kVar2.f20973l;
        Group group4 = kVar2.f20972k;
        if (strMCode == null || C2576A.H(strMCode)) {
            group4.setVisibility(8);
            group3.setVisibility(8);
        } else {
            String strMNetwork = shopPurchaseHistory2.mNetwork();
            Iterator<String> it = ((com.paymaya.data.preference.a) c2038a.f19100b).e().mShopConfig().mTreatsNetworks().iterator();
            while (true) {
                if (it.hasNext()) {
                    String next = it.next();
                    kotlin.jvm.internal.j.d(next);
                    int length = next.length() - 1;
                    int i4 = 0;
                    boolean z5 = false;
                    while (i4 <= length) {
                        boolean z8 = kotlin.jvm.internal.j.i(next.charAt(!z5 ? i4 : length), 32) <= 0 ? z4 : false;
                        if (z5) {
                            if (!z8) {
                                break;
                            } else {
                                length--;
                            }
                        } else if (z8) {
                            i4++;
                        } else {
                            z5 = z4;
                        }
                    }
                    String string = next.subSequence(i4, length + 1).toString();
                    boolean z9 = z4;
                    if (zj.z.o(string, strMNetwork, z9)) {
                        group4.setVisibility(8);
                        group3.setVisibility(0);
                        String strMCode2 = shopPurchaseHistory2.mCode();
                        if (strMCode2 != null) {
                            strTnTj786 = strMCode2;
                        }
                        kVar2.h.setText(strTnTj786);
                    } else {
                        z4 = z9;
                    }
                } else {
                    group4.setVisibility(0);
                    group3.setVisibility(8);
                    String strMCode3 = shopPurchaseHistory2.mCode();
                    if (strMCode3 != null) {
                        strTnTj786 = strMCode3;
                    }
                    kVar2.f20971g.setText(strTnTj786);
                }
            }
        }
        boolean zEqualsIgnoreCase2 = strTnTj783.equalsIgnoreCase(shopPurchaseHistory2.mNetwork());
        LinearLayout linearLayout2 = kVar2.i;
        if (zEqualsIgnoreCase2 || strTnTj782.equalsIgnoreCase(shopPurchaseHistory2.mNetwork())) {
            HashMap map3 = new HashMap();
            map3.put(strTnTj78, shopPurchaseHistory2.mRecipient());
            kVar2.E(map3);
            linearLayout2.setVisibility(0);
            return;
        }
        List<OrderProviderField> listMOtherFields2 = shopPurchaseHistory2.mOtherFields();
        if (listMOtherFields2 != null) {
            ArrayList arrayList4 = new ArrayList();
            for (Object obj4 : listMOtherFields2) {
                if (!kotlin.jvm.internal.j.b(((OrderProviderField) obj4).mIsHidden(), Boolean.TRUE)) {
                    arrayList4.add(obj4);
                }
            }
            arrayList = arrayList4;
        } else {
            arrayList = null;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            linearLayout2.setVisibility(8);
            return;
        }
        HashMap map4 = new HashMap();
        for (OrderProviderField orderProviderField2 : arrayList) {
            map4.put(orderProviderField2.mName(), orderProviderField2.mValue());
        }
        kVar2.E(map4);
        linearLayout2.setVisibility(0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        kotlin.jvm.internal.j.g(viewGroup, numX49.tnTj78("bFlM"));
        com.paymaya.data.preference.a aVar = this.f20317b;
        String strTnTj78 = numX49.tnTj78("bFlN");
        LayoutInflater layoutInflater = this.f20318d;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return new w(layoutInflater.inflate(R.layout.pma_view_loading, viewGroup, false));
                }
                if (i != 3) {
                    throw new PayMayaRuntimeException(We.s.f(i, numX49.tnTj78("bFl6")));
                }
                View viewInflate = layoutInflater.inflate(R.layout.pma_view_date_header_view_all, viewGroup, false);
                DateHeaderTransactionViewHolder dateHeaderTransactionViewHolder = new DateHeaderTransactionViewHolder(viewInflate);
                ButterKnife.bind(dateHeaderTransactionViewHolder, viewInflate);
                dateHeaderTransactionViewHolder.f14469a = new M(dateHeaderTransactionViewHolder, 4);
                return dateHeaderTransactionViewHolder;
            }
            View viewInflate2 = layoutInflater.inflate(R.layout.pma_view_shop_v3_purchase_history_processing_item, viewGroup, false);
            int i4 = R.id.dynamic_fields_container_linear_layout_pma_view_shop_v3_purchase_history_processing_item;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(viewInflate2, R.id.dynamic_fields_container_linear_layout_pma_view_shop_v3_purchase_history_processing_item);
            if (linearLayout != null) {
                i4 = R.id.gifted_constraint_group_pma_view_shop_v3_purchase_history_processing_item;
                Group group = (Group) ViewBindings.findChildViewById(viewInflate2, R.id.gifted_constraint_group_pma_view_shop_v3_purchase_history_processing_item);
                if (group != null) {
                    i4 = R.id.gifted_icon_image_view_pma_view_shop_v3_purchase_history_processing_item;
                    if (((ImageView) ViewBindings.findChildViewById(viewInflate2, R.id.gifted_icon_image_view_pma_view_shop_v3_purchase_history_processing_item)) != null) {
                        i4 = R.id.gifted_recipient_text_view_pma_view_shop_v3_purchase_history_processing_item;
                        TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate2, R.id.gifted_recipient_text_view_pma_view_shop_v3_purchase_history_processing_item);
                        if (textView != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate2;
                            i4 = R.id.product_description_text_view_pma_view_shop_v3_purchase_history_processing_item;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate2, R.id.product_description_text_view_pma_view_shop_v3_purchase_history_processing_item);
                            if (textView2 != null) {
                                i4 = R.id.product_icon_guideline_pma_view_shop_v3_purchase_history_processing_item;
                                if (((Guideline) ViewBindings.findChildViewById(viewInflate2, R.id.product_icon_guideline_pma_view_shop_v3_purchase_history_processing_item)) != null) {
                                    i4 = R.id.product_icon_image_view_pma_view_shop_v3_purchase_history_processing_item;
                                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate2, R.id.product_icon_image_view_pma_view_shop_v3_purchase_history_processing_item);
                                    if (imageView != null) {
                                        i4 = R.id.product_name_text_view_pma_view_shop_v3_purchase_history_processing_item;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate2, R.id.product_name_text_view_pma_view_shop_v3_purchase_history_processing_item);
                                        if (textView3 != null) {
                                            i4 = R.id.product_price_text_view_pma_view_shop_v3_purchase_history_processing_item;
                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate2, R.id.product_price_text_view_pma_view_shop_v3_purchase_history_processing_item);
                                            if (textView4 != null) {
                                                return new xe.l(new C0466m((ViewGroup) constraintLayout, (Object) linearLayout, (View) group, (Object) textView, (Object) textView2, (Object) imageView, (View) textView3, (View) textView4, 25), aVar, this);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            throw new NullPointerException(strTnTj78.concat(viewInflate2.getResources().getResourceName(i4)));
        }
        View viewInflate3 = layoutInflater.inflate(R.layout.pma_view_shop_v3_purchase_history_completed_item, viewGroup, false);
        int i6 = R.id.dynamic_fields_container_linear_layout_pma_view_shop_v3_purchase_history_completed_item;
        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(viewInflate3, R.id.dynamic_fields_container_linear_layout_pma_view_shop_v3_purchase_history_completed_item);
        if (linearLayout2 != null) {
            i6 = R.id.gaming_pin_background_view_pma_view_shop_v3_purchase_history_completed_item;
            View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate3, R.id.gaming_pin_background_view_pma_view_shop_v3_purchase_history_completed_item);
            if (viewFindChildViewById != null) {
                i6 = R.id.gaming_pin_code_label_text_view_pma_view_shop_v3_purchase_history_completed_item;
                if (((TextView) ViewBindings.findChildViewById(viewInflate3, R.id.gaming_pin_code_label_text_view_pma_view_shop_v3_purchase_history_completed_item)) != null) {
                    i6 = R.id.gaming_pin_code_value_text_view_pma_view_shop_v3_purchase_history_completed_item;
                    TextView textView5 = (TextView) ViewBindings.findChildViewById(viewInflate3, R.id.gaming_pin_code_value_text_view_pma_view_shop_v3_purchase_history_completed_item);
                    if (textView5 != null) {
                        i6 = R.id.gaming_pin_constraint_group_pma_view_shop_v3_purchase_history_completed_item;
                        Group group2 = (Group) ViewBindings.findChildViewById(viewInflate3, R.id.gaming_pin_constraint_group_pma_view_shop_v3_purchase_history_completed_item);
                        if (group2 != null) {
                            i6 = R.id.gaming_pin_copy_text_view_pma_view_shop_v3_purchase_history_completed_item;
                            TextView textView6 = (TextView) ViewBindings.findChildViewById(viewInflate3, R.id.gaming_pin_copy_text_view_pma_view_shop_v3_purchase_history_completed_item);
                            if (textView6 != null) {
                                i6 = R.id.gifted_constraint_group_pma_view_shop_v3_purchase_history_completed_item;
                                Group group3 = (Group) ViewBindings.findChildViewById(viewInflate3, R.id.gifted_constraint_group_pma_view_shop_v3_purchase_history_completed_item);
                                if (group3 != null) {
                                    i6 = R.id.gifted_icon_image_view_pma_view_shop_v3_purchase_history_completed_item;
                                    if (((ImageView) ViewBindings.findChildViewById(viewInflate3, R.id.gifted_icon_image_view_pma_view_shop_v3_purchase_history_completed_item)) != null) {
                                        i6 = R.id.gifted_recipient_text_view_pma_view_shop_v3_purchase_history_completed_item;
                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(viewInflate3, R.id.gifted_recipient_text_view_pma_view_shop_v3_purchase_history_completed_item);
                                        if (textView7 != null) {
                                            ConstraintLayout constraintLayout2 = (ConstraintLayout) viewInflate3;
                                            i6 = R.id.product_description_text_view_pma_view_shop_v3_purchase_history_completed_item;
                                            TextView textView8 = (TextView) ViewBindings.findChildViewById(viewInflate3, R.id.product_description_text_view_pma_view_shop_v3_purchase_history_completed_item);
                                            if (textView8 != null) {
                                                i6 = R.id.product_icon_guideline_pma_view_shop_v3_purchase_history_completed_item;
                                                if (((Guideline) ViewBindings.findChildViewById(viewInflate3, R.id.product_icon_guideline_pma_view_shop_v3_purchase_history_completed_item)) != null) {
                                                    i6 = R.id.product_icon_image_view_pma_view_shop_v3_purchase_history_completed_item;
                                                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(viewInflate3, R.id.product_icon_image_view_pma_view_shop_v3_purchase_history_completed_item);
                                                    if (imageView2 != null) {
                                                        i6 = R.id.product_name_text_view_pma_view_shop_v3_purchase_history_completed_item;
                                                        TextView textView9 = (TextView) ViewBindings.findChildViewById(viewInflate3, R.id.product_name_text_view_pma_view_shop_v3_purchase_history_completed_item);
                                                        if (textView9 != null) {
                                                            i6 = R.id.product_price_text_view_pma_view_shop_v3_purchase_history_completed_item;
                                                            TextView textView10 = (TextView) ViewBindings.findChildViewById(viewInflate3, R.id.product_price_text_view_pma_view_shop_v3_purchase_history_completed_item);
                                                            if (textView10 != null) {
                                                                i6 = R.id.treats_background_view_pma_view_shop_v3_purchase_history_completed_item;
                                                                View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate3, R.id.treats_background_view_pma_view_shop_v3_purchase_history_completed_item);
                                                                if (viewFindChildViewById2 != null) {
                                                                    i6 = R.id.treats_code_label_text_view_pma_view_shop_v3_purchase_history_completed_item;
                                                                    if (((TextView) ViewBindings.findChildViewById(viewInflate3, R.id.treats_code_label_text_view_pma_view_shop_v3_purchase_history_completed_item)) != null) {
                                                                        i6 = R.id.treats_code_value_text_view_pma_view_shop_v3_purchase_history_completed_item;
                                                                        TextView textView11 = (TextView) ViewBindings.findChildViewById(viewInflate3, R.id.treats_code_value_text_view_pma_view_shop_v3_purchase_history_completed_item);
                                                                        if (textView11 != null) {
                                                                            i6 = R.id.treats_constraint_group_pma_view_shop_v3_purchase_history_completed_item;
                                                                            Group group4 = (Group) ViewBindings.findChildViewById(viewInflate3, R.id.treats_constraint_group_pma_view_shop_v3_purchase_history_completed_item);
                                                                            if (group4 != null) {
                                                                                return new xe.k(new N5.M(constraintLayout2, linearLayout2, viewFindChildViewById, textView5, group2, textView6, group3, textView7, textView8, imageView2, textView9, textView10, viewFindChildViewById2, textView11, group4), aVar, this);
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
        throw new NullPointerException(strTnTj78.concat(viewInflate3.getResources().getResourceName(i6)));
    }
}
