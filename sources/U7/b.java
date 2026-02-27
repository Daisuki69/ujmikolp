package U7;

import N5.E;
import Q6.l;
import W7.d;
import W7.f;
import W7.g;
import We.A;
import We.G;
import We.s;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.TextViewCompat;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.exception.PayMayaRuntimeException;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1230t;
import com.paymaya.common.widget.ItemSlideLayoutView;
import com.paymaya.domain.model.Favorite;
import com.paymaya.domain.model.FavoriteReminder;
import com.paymaya.domain.model.ImageUrlUnfiltered;
import com.paymaya.domain.model.ReminderDisplay;
import com.paymaya.mayaui.favorite.view.fragment.impl.MayaFavoriteCategoryFragment;
import e8.InterfaceC1430a;
import e8.InterfaceC1431b;
import f8.C1469b;
import f8.C1470c;
import f8.C1471d;
import f8.C1473f;
import java.util.ArrayList;
import k2.v0;
import kotlin.jvm.internal.j;
import w5.C2383a;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends ListAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MayaFavoriteCategoryFragment f5956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f5957b;

    public b(MayaFavoriteCategoryFragment mayaFavoriteCategoryFragment) {
        super(new C2383a());
        this.f5956a = mayaFavoriteCategoryFragment;
        this.f5957b = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return ((g) this.f5957b.get(i)).a().f6336a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        j.g(holder, "holder");
        if (holder instanceof C1471d) {
            Object item = getItem(i);
            j.e(item, "null cannot be cast to non-null type com.paymaya.mayaui.favorite.model.FavoriteItem.Header");
            String title = ((W7.c) item).f6327a;
            j.g(title, "title");
            l lVar = ((C1471d) holder).f16733a;
            lVar.getClass();
            C1471d c1471d = (C1471d) ((InterfaceC1430a) lVar.c.get());
            c1471d.getClass();
            c1471d.f16734b.setText(title);
            return;
        }
        if (!(holder instanceof C1473f)) {
            if ((holder instanceof f8.g) || (holder instanceof C1469b)) {
                return;
            }
            boolean z4 = holder instanceof C1470c;
            return;
        }
        Object item2 = getItem(i);
        j.e(item2, "null cannot be cast to non-null type com.paymaya.mayaui.favorite.model.FavoriteItem.Item");
        d dVar = (d) item2;
        C1473f c1473f = (C1473f) holder;
        Favorite favorite = dVar.f6329a;
        boolean z5 = dVar.f6330b;
        j.g(favorite, "favorite");
        c1473f.m = favorite;
        ItemSlideLayoutView itemSlideLayoutView = c1473f.j;
        itemSlideLayoutView.c(false);
        itemSlideLayoutView.f11274g = 0.0f;
        itemSlideLayoutView.i = 0.0f;
        l lVar2 = c1473f.f16742l;
        lVar2.getClass();
        FavoriteReminder favoriteReminderMFavoriteReminder = favorite.mFavoriteReminder();
        if (favoriteReminderMFavoriteReminder != null) {
            ReminderDisplay display = favoriteReminderMFavoriteReminder.getDisplay();
            Integer value = display != null ? display.getValue() : null;
            if (value != null && value.intValue() == 0) {
                C1473f c1473f2 = (C1473f) ((InterfaceC1431b) lVar2.c.get());
                jk.b.b(c1473f2.c, R.attr.mayaColorError);
                String string = c1473f2.itemView.getContext().getString(R.string.maya_label_biller_favorite_pay_today);
                TextView textView = c1473f2.f16738b;
                textView.setText(string);
                TextViewCompat.setTextAppearance(textView, R.style.JekoBoldOverlineMedium_Error);
            } else {
                C1473f c1473f3 = (C1473f) ((InterfaceC1431b) lVar2.c.get());
                jk.b.b(c1473f3.c, R.attr.mayaColorIconTintQuaternary);
                String string2 = c1473f3.itemView.getContext().getString(R.string.maya_label_biller_favorite_reminder_set);
                TextView textView2 = c1473f3.f16738b;
                textView2.setText(string2);
                TextViewCompat.setTextAppearance(textView2, R.style.JekoBoldOverlineMedium_Quaternary);
            }
            ((C1473f) ((InterfaceC1431b) lVar2.c.get())).f16739d.setVisibility(0);
        } else {
            ((C1473f) ((InterfaceC1431b) lVar2.c.get())).f16739d.setVisibility(8);
        }
        ((C1473f) ((InterfaceC1431b) lVar2.c.get())).e.setText(favorite.mAlias());
        String contentPreviewText2 = j.b(favorite.mType(), "bank") ? favorite.getContentPreviewText2() : favorite.getContentPreviewText1();
        if (contentPreviewText2 == null || C2576A.H(contentPreviewText2)) {
            ((C1473f) ((InterfaceC1431b) lVar2.c.get())).f.setVisibility(8);
        } else {
            C1473f c1473f4 = (C1473f) ((InterfaceC1431b) lVar2.c.get());
            c1473f4.getClass();
            TextView textView3 = c1473f4.f;
            textView3.setVisibility(0);
            textView3.setText(contentPreviewText2);
        }
        String contentPreviewText1 = j.b(favorite.mType(), "bank") ? favorite.getContentPreviewText1() : favorite.getContentPreviewText2();
        if (contentPreviewText1 == null || C2576A.H(contentPreviewText1)) {
            ((C1473f) ((InterfaceC1431b) lVar2.c.get())).f16740g.setVisibility(8);
        } else {
            C1473f c1473f5 = (C1473f) ((InterfaceC1431b) lVar2.c.get());
            c1473f5.getClass();
            TextView textView4 = c1473f5.f16740g;
            textView4.setVisibility(0);
            textView4.setText(contentPreviewText1);
        }
        String strMType = favorite.mType();
        if (strMType != null) {
            int iHashCode = strMType.hashCode();
            if (iHashCode != -1712615352) {
                if (iHashCode != 3016252) {
                    if (iHashCode == 890552284 && strMType.equals("billspay")) {
                        ImageUrlUnfiltered imageUrlUnfilteredMMedia = favorite.mContentPreview().mMedia();
                        if (imageUrlUnfilteredMMedia != null) {
                            InterfaceC1431b interfaceC1431b = (InterfaceC1431b) lVar2.c.get();
                            String strO = C.O(imageUrlUnfilteredMMedia.mAndroidImageUrl());
                            C1473f c1473f6 = (C1473f) interfaceC1431b;
                            c1473f6.getClass();
                            int iO = v0.o(34);
                            G g8 = A.d().g(strO == null ? null : Uri.parse(strO));
                            g8.h(R.drawable.maya_ic_pay_bills_category_placeholder);
                            g8.i(new C1230t(iO, iO));
                            g8.e(c1473f6.i, null);
                        } else {
                            C1473f c1473f7 = (C1473f) ((InterfaceC1431b) lVar2.c.get());
                            c1473f7.getClass();
                            int iO2 = v0.o(34);
                            G gF = A.d().f(R.drawable.maya_ic_pay_bills_category_placeholder);
                            gF.i(new C1230t(iO2, iO2));
                            gF.e(c1473f7.i, null);
                        }
                    }
                } else if (strMType.equals("bank")) {
                    ((C1473f) ((InterfaceC1431b) lVar2.c.get())).i.setImageResource(R.drawable.maya_ic_bank_transfer_placeholder_green);
                }
            } else if (strMType.equals("moneysend")) {
                ((C1473f) ((InterfaceC1431b) lVar2.c.get())).i.setImageResource(R.drawable.maya_ic_profile_placeholder_purple);
            }
        }
        if (z5) {
            ((C1473f) ((InterfaceC1431b) lVar2.c.get())).f16741k.setVisibility(8);
        } else {
            ((C1473f) ((InterfaceC1431b) lVar2.c.get())).f16741k.setVisibility(0);
        }
        if (!j.b(favorite.mIsMaintenance(), Boolean.TRUE)) {
            C1473f c1473f8 = (C1473f) ((InterfaceC1431b) lVar2.c.get());
            c1473f8.h.setVisibility(8);
            c1473f8.e.setAlpha(1.0f);
            c1473f8.i.setAlpha(1.0f);
            return;
        }
        C1473f c1473f9 = (C1473f) ((InterfaceC1431b) lVar2.c.get());
        c1473f9.h.setVisibility(0);
        c1473f9.f.setVisibility(8);
        c1473f9.f16740g.setVisibility(8);
        c1473f9.e.setAlpha(0.4f);
        c1473f9.i.setAlpha(0.4f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        j.g(parent, "parent");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
        f fVar = f.f6333b;
        if (i == 0) {
            View viewInflate = layoutInflaterFrom.inflate(R.layout.maya_view_favorite_list_header, parent, false);
            TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.biller_header_title_text_view);
            if (textView != null) {
                return new C1471d(new N5.A((ConstraintLayout) viewInflate, textView, 3));
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.biller_header_title_text_view)));
        }
        if (i == 1) {
            View viewInflate2 = layoutInflaterFrom.inflate(R.layout.maya_view_favorite_list_top, parent, false);
            if (viewInflate2 != null) {
                return new f8.g((ConstraintLayout) viewInflate2);
            }
            throw new NullPointerException("rootView");
        }
        if (i != 2) {
            if (i == 3) {
                View viewInflate3 = layoutInflaterFrom.inflate(R.layout.maya_view_favorite_list_bottom, parent, false);
                if (viewInflate3 != null) {
                    return new C1469b((ConstraintLayout) viewInflate3);
                }
                throw new NullPointerException("rootView");
            }
            if (i != 4) {
                throw new PayMayaRuntimeException(s.f(i, "Invalid view type : "));
            }
            View viewInflate4 = layoutInflaterFrom.inflate(R.layout.maya_view_favorite_list_footer, parent, false);
            if (((TextView) ViewBindings.findChildViewById(viewInflate4, R.id.layout_favorite_list_bottom)) != null) {
                return new C1470c((ConstraintLayout) viewInflate4);
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate4.getResources().getResourceName(R.id.layout_favorite_list_bottom)));
        }
        View viewInflate5 = layoutInflaterFrom.inflate(R.layout.maya_view_favorite_list_item, parent, false);
        int i4 = R.id.card_content_view;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(viewInflate5, R.id.card_content_view);
        if (constraintLayout != null) {
            i4 = R.id.constraint_group_reminder_flag;
            Group group = (Group) ViewBindings.findChildViewById(viewInflate5, R.id.constraint_group_reminder_flag);
            if (group != null) {
                i4 = R.id.icon_image;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate5, R.id.icon_image);
                if (imageView != null) {
                    i4 = R.id.image_view_favorite_reminder_bell;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(viewInflate5, R.id.image_view_favorite_reminder_bell);
                    if (imageView2 != null) {
                        ItemSlideLayoutView itemSlideLayoutView = (ItemSlideLayoutView) viewInflate5;
                        i4 = R.id.remove_content_view;
                        ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(viewInflate5, R.id.remove_content_view);
                        if (constraintLayout2 != null) {
                            i4 = R.id.remove_image_view;
                            if (((ImageView) ViewBindings.findChildViewById(viewInflate5, R.id.remove_image_view)) != null) {
                                i4 = R.id.remove_text_view;
                                if (((TextView) ViewBindings.findChildViewById(viewInflate5, R.id.remove_text_view)) != null) {
                                    i4 = R.id.space_details_left_offset;
                                    if (((Space) ViewBindings.findChildViewById(viewInflate5, R.id.space_details_left_offset)) != null) {
                                        i4 = R.id.space_details_right_offset;
                                        if (((Space) ViewBindings.findChildViewById(viewInflate5, R.id.space_details_right_offset)) != null) {
                                            i4 = R.id.text_view_alias;
                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate5, R.id.text_view_alias);
                                            if (textView2 != null) {
                                                i4 = R.id.text_view_line1;
                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate5, R.id.text_view_line1);
                                                if (textView3 != null) {
                                                    i4 = R.id.text_view_line2;
                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate5, R.id.text_view_line2);
                                                    if (textView4 != null) {
                                                        i4 = R.id.text_view_maintenance;
                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(viewInflate5, R.id.text_view_maintenance);
                                                        if (textView5 != null) {
                                                            i4 = R.id.text_view_reminder_status;
                                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(viewInflate5, R.id.text_view_reminder_status);
                                                            if (textView6 != null) {
                                                                i4 = R.id.view_divider_favorite_item;
                                                                View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate5, R.id.view_divider_favorite_item);
                                                                if (viewFindChildViewById != null) {
                                                                    return new C1473f(new E(itemSlideLayoutView, constraintLayout, group, imageView, imageView2, itemSlideLayoutView, constraintLayout2, textView2, textView3, textView4, textView5, textView6, viewFindChildViewById), this.f5956a);
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
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate5.getResources().getResourceName(i4)));
    }
}
