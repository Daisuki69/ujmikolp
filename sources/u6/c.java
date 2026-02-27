package U6;

import G6.r;
import N5.C0452f1;
import N5.C0453g;
import We.A;
import We.G;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.utility.C1231u;
import com.paymaya.domain.model.ContactBottomDividerModel;
import com.paymaya.domain.model.ContactHeaderModel;
import com.paymaya.domain.model.ContactListItem;
import com.paymaya.domain.model.ContactModel;
import com.paymaya.mayaui.common.view.fragment.impl.MayaContactsSelectionFragment;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.j;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MayaContactsSelectionFragment f5952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LayoutInflater f5953b;
    public final ArrayList c;

    public c(Context context, MayaContactsSelectionFragment mayaContactsSelectionFragment) {
        this.f5952a = mayaContactsSelectionFragment;
        Object systemService = context.getSystemService("layout_inflater");
        j.e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        this.f5953b = (LayoutInflater) systemService;
        this.c = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return ((ContactListItem) this.c.get(i)) instanceof ContactHeaderModel ? 1 : 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        j.g(holder, "holder");
        ContactListItem contactListItem = (ContactListItem) this.c.get(i);
        if (!(contactListItem instanceof ContactModel)) {
            if (!(contactListItem instanceof ContactHeaderModel)) {
                if (!(contactListItem instanceof ContactBottomDividerModel)) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            } else {
                String initial = ((ContactHeaderModel) contactListItem).getLetter();
                j.g(initial, "initial");
                ((Z6.c) holder).f6896a.setText(initial);
                return;
            }
        }
        Z6.d dVar = (Z6.d) holder;
        ContactModel contactModel = (ContactModel) contactListItem;
        j.g(contactModel, "contactModel");
        dVar.f = contactModel;
        String name = contactModel.getName();
        String number = contactModel.getNumber();
        String imageUri = contactModel.getImageUri();
        r rVar = dVar.e;
        rVar.getClass();
        j.g(name, "name");
        j.g(number, "number");
        boolean zH = C2576A.H(name);
        Z6.d dVar2 = (Z6.d) rVar.f1812b;
        TextView textView = dVar2.f6898b;
        if (zH) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(name);
        }
        dVar2.c.setText(number);
        AppCompatImageView appCompatImageView = dVar2.f6899d;
        if (imageUri != null && !C2576A.H(imageUri)) {
            G g8 = A.d().g(Uri.parse(imageUri));
            g8.i(new C1231u());
            g8.e(appCompatImageView, null);
            return;
        }
        Context context = appCompatImageView.getContext();
        if (context != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            if (theme != null) {
                theme.resolveAttribute(R.attr.mayaDrawable_CommonContactsAvatarIcon, typedValue, true);
            }
            Drawable drawable = ContextCompat.getDrawable(context, typedValue.resourceId);
            if (drawable == null) {
                drawable = ContextCompat.getDrawable(context, R.drawable.maya_ic_contacts_avatar_light);
            }
            appCompatImageView.setImageDrawable(drawable);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        j.g(parent, "parent");
        LayoutInflater layoutInflater = this.f5953b;
        if (i == 1) {
            View viewInflate = layoutInflater.inflate(R.layout.maya_view_contacts_initial_header_item, parent, false);
            if (viewInflate == null) {
                throw new NullPointerException("rootView");
            }
            TextView textView = (TextView) viewInflate;
            return new Z6.c(new C0452f1(textView, textView, 1));
        }
        View viewInflate2 = layoutInflater.inflate(R.layout.maya_view_contacts_option_item, parent, false);
        int i4 = R.id.image_view_contact_avatar;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(viewInflate2, R.id.image_view_contact_avatar);
        if (appCompatImageView != null) {
            i4 = R.id.text_view_contact_mobile_number;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate2, R.id.text_view_contact_mobile_number);
            if (textView2 != null) {
                i4 = R.id.text_view_contact_name;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate2, R.id.text_view_contact_name);
                if (textView3 != null) {
                    return new Z6.d(new C0453g(26, (ConstraintLayout) viewInflate2, appCompatImageView, textView2, textView3), this);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(i4)));
    }
}
