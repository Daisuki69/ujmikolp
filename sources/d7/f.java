package D7;

import N5.C0441c;
import N5.C0446d1;
import N5.r1;
import We.s;
import a7.EnumC0650k;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.adkit.presentation.banneradcarousel.view.BannerAdCarousel;
import com.paymaya.common.exception.PayMayaRuntimeException;
import com.paymaya.common.utility.AbstractC1233w;
import com.paymaya.domain.model.ClevertapAd;
import com.paymaya.domain.model.SecondaryFeature;
import com.paymaya.domain.model.ServicesFeatureCategoryDetails;
import com.paymaya.mayaui.common.view.widget.MayaCarousel;
import com.paymaya.mayaui.dashboard.view.fragment.impl.MayaServicesV2Fragment;
import com.paymaya.mayaui.dashboard.view.widget.MayaServicesCoreItemsView;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.j;
import w.C2361c;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.paymaya.data.preference.a f996b;
    public final MayaServicesV2Fragment c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LayoutInflater f997d;
    public final ArrayList e;
    public MayaCarousel f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f998g;

    public f(Context context, com.paymaya.data.preference.a aVar, MayaServicesV2Fragment mayaServicesV2Fragment) {
        this.f995a = context;
        this.f996b = aVar;
        this.c = mayaServicesV2Fragment;
        Object systemService = context.getSystemService("layout_inflater");
        j.e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        this.f997d = (LayoutInflater) systemService;
        this.e = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return ((J7.j) this.e.get(i)).f2447a;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        int i4 = 3;
        j.g(holder, "holder");
        J7.j jVar = (J7.j) this.e.get(i);
        int i6 = i + 1;
        boolean z4 = holder instanceof I7.f;
        Context context = this.f995a;
        if (z4) {
            j.e(jVar, "null cannot be cast to non-null type com.paymaya.mayaui.dashboard.view.widget.MayaServicesSectionItem.CoreItems");
            I7.f fVar = (I7.f) holder;
            ArrayList arrayList = ((J7.h) jVar).f2446b;
            j.g(context, "context");
            arrayList.size();
            fVar.f2235d = i6;
            J5.a aVar = fVar.f2234b;
            aVar.getClass();
            I7.f fVar2 = (I7.f) aVar.f2414b;
            Ag.j jVar2 = new Ag.j(fVar2, i4);
            MayaServicesCoreItemsView mayaServicesCoreItemsView = fVar2.c;
            mayaServicesCoreItemsView.setListener(jVar2);
            mayaServicesCoreItemsView.setItems(arrayList);
            return;
        }
        if (holder instanceof I7.e) {
            j.e(jVar, "null cannot be cast to non-null type com.paymaya.mayaui.dashboard.view.widget.MayaServicesSectionItem.CategoryItem");
            I7.e eVar = (I7.e) holder;
            ServicesFeatureCategoryDetails category = ((J7.g) jVar).f2445b;
            j.g(category, "category");
            j.g(context, "context");
            eVar.f2232g = category;
            eVar.h = i6;
            GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 4);
            c cVar = new c(context, eVar);
            eVar.f = cVar;
            RecyclerView recyclerView = eVar.e;
            recyclerView.setAdapter(cVar);
            recyclerView.setLayoutManager(gridLayoutManager);
            C2361c c2361c = eVar.f2230b;
            c2361c.getClass();
            String title = category.getName();
            I7.e eVar2 = (I7.e) c2361c.f20518b;
            j.g(title, "title");
            eVar2.c.setText(title);
            eVar2.e.addItemDecoration(new E7.a(eVar2.itemView.getContext().getResources().getDimensionPixelSize(R.dimen.maya_margin_normal), eVar2.itemView.getContext().getResources().getDimensionPixelSize(R.dimen.maya_margin_medium), eVar2.itemView.getContext().getResources().getDimensionPixelSize(R.dimen.maya_secondary_feature_badge_label_inset_vertical), eVar2.itemView.getContext().getResources().getDimensionPixelSize(R.dimen.maya_secondary_feature_badge_label_inset_horizontal)));
            String bgColorHex = category.getBgColorHex();
            CardView cardView = eVar2.f2231d;
            if (bgColorHex == null || bgColorHex.length() == 0) {
                cardView.setCardBackgroundColor(ContextCompat.getColor(cardView.getContext(), R.color.maya_shades_of_grey_3));
            } else {
                try {
                    cardView.setCardBackgroundColor(Color.parseColor("#" + category.getBgColorHex()));
                } catch (IllegalStateException unused) {
                    cardView.setCardBackgroundColor(ContextCompat.getColor(cardView.getContext(), R.color.maya_shades_of_grey_3));
                } catch (NumberFormatException unused2) {
                    cardView.setCardBackgroundColor(ContextCompat.getColor(cardView.getContext(), R.color.maya_shades_of_grey_3));
                }
            }
            List<SecondaryFeature> services = category.getServiceIds();
            j.g(services, "services");
            c cVar2 = eVar2.f;
            if (cVar2 != null) {
                cVar2.e(services);
                return;
            }
            return;
        }
        if (!(holder instanceof I7.d)) {
            if (holder instanceof I7.g) {
                I7.g gVar = (I7.g) holder;
                MayaServicesV2Fragment mayaServicesV2Fragment = gVar.f2236a;
                mayaServicesV2Fragment.getClass();
                BannerAdCarousel adBannerCarouselView = gVar.f2237b;
                j.g(adBannerCarouselView, "adBannerCarouselView");
                mayaServicesV2Fragment.f12199o0 = adBannerCarouselView;
                mayaServicesV2Fragment.G1().k();
                return;
            }
            return;
        }
        I7.d dVar = (I7.d) holder;
        MayaCarousel mayaCarousel = dVar.f2228d;
        if (mayaCarousel != null) {
            int i10 = MayaCarousel.f11992x0;
            Resources resources = mayaCarousel.getResources();
            j.f(resources, "getResources(...)");
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.maya_carousel_services_banner_width);
            Resources resources2 = mayaCarousel.getResources();
            j.f(resources2, "getResources(...)");
            int dimensionPixelSize2 = resources2.getDimensionPixelSize(R.dimen.maya_carousel_services_banner_height);
            mayaCarousel.h(dimensionPixelSize, dimensionPixelSize2, 0);
            mayaCarousel.j(dimensionPixelSize, dimensionPixelSize2, 0);
            mayaCarousel.setAdsCornerRadiusDimens(R.dimen.maya_radius_16dp);
            mayaCarousel.setDividerSizeInPx(dVar.itemView.getResources().getDimensionPixelSize(R.dimen.maya_margin_12));
            mayaCarousel.setDividerMode(EnumC0650k.f7026b);
            MayaServicesV2Fragment mayaServicesV2Fragment2 = this.c;
            mayaCarousel.setCarouselListener(mayaServicesV2Fragment2);
            mayaCarousel.setCarouselStateListener(mayaServicesV2Fragment2);
            mayaCarousel.setClevertapAdTextStyle(ClevertapAd.TextStyle.FULL_SIZE_BANNER);
            mayaCarousel.setAutomaticScrolling(true);
            mayaCarousel.setEndlessScrolling(true);
            mayaCarousel.setHideCarouselTitle(true);
            mayaCarousel.setImageRatio(dVar.f2227b);
            mayaCarousel.setIndicatorEnabled(false);
            mayaCarousel.setDefaultImagePlaceholder(2131231031);
            mayaCarousel.setFilterAdsByScreen(dVar.f2226a);
            mayaCarousel.setBannerPriorityFixEnabled(dVar.c);
            int dimensionPixelSize3 = dVar.itemView.getResources().getDimensionPixelSize(R.dimen.maya_margin_24);
            ViewParent parent = mayaCarousel.getParent();
            j.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            int measuredWidth = ((ViewGroup) parent).getMeasuredWidth();
            int i11 = measuredWidth - (dimensionPixelSize3 * 2);
            int imageRatio = (int) (mayaCarousel.getImageRatio() * ((double) i11));
            if (measuredWidth > 0 || i11 > 0 || imageRatio > 0) {
                mayaCarousel.h(i11, imageRatio, i11);
                mayaCarousel.j(i11, imageRatio, i11);
            }
            mayaCarousel.e();
            mayaCarousel.setBannerDefaultConstraint(3);
            mayaCarousel.setVisibility(0);
            mayaCarousel.k();
        }
        this.f = mayaCarousel;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        j.g(parent, "parent");
        com.paymaya.data.preference.a aVar = this.f996b;
        MayaServicesV2Fragment mayaServicesV2Fragment = this.c;
        LayoutInflater layoutInflater = this.f997d;
        if (i == 0) {
            View viewInflate = layoutInflater.inflate(R.layout.maya_view_holder_services_core, parent, false);
            if (viewInflate == null) {
                throw new NullPointerException("rootView");
            }
            MayaServicesCoreItemsView mayaServicesCoreItemsView = (MayaServicesCoreItemsView) viewInflate;
            return new I7.f(new C0441c(mayaServicesCoreItemsView, mayaServicesCoreItemsView, 13), mayaServicesV2Fragment, aVar);
        }
        if (i == 1) {
            View viewInflate2 = layoutInflater.inflate(R.layout.maya_view_holder_service_category_v2, parent, false);
            CardView cardView = (CardView) viewInflate2;
            int i4 = R.id.recycler_view;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewInflate2, R.id.recycler_view);
            if (recyclerView != null) {
                i4 = R.id.text_view_category_title;
                TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate2, R.id.text_view_category_title);
                if (textView != null) {
                    return new I7.e(new r1((ViewGroup) cardView, (View) cardView, (Object) recyclerView, (Object) textView, 0), mayaServicesV2Fragment, aVar);
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(i4)));
        }
        if (i != 2) {
            if (i == 3) {
                return new I7.g(C0446d1.a(layoutInflater.inflate(R.layout.maya_view_ad_banner, parent, false)), mayaServicesV2Fragment);
            }
            throw new PayMayaRuntimeException(s.f(i, "Invalid view type : "));
        }
        View viewInflate3 = layoutInflater.inflate(R.layout.maya_view_holder_service_clevertap_carousel, parent, false);
        MayaCarousel mayaCarousel = (MayaCarousel) ViewBindings.findChildViewById(viewInflate3, R.id.services_carousel);
        if (mayaCarousel == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate3.getResources().getResourceName(R.id.services_carousel)));
        }
        I7.d dVar = new I7.d(new C0441c((FrameLayout) viewInflate3, mayaCarousel, 12), mayaServicesV2Fragment, aVar);
        dVar.f2226a = AbstractC1233w.f11241p;
        dVar.f2227b = 0.29569892d;
        dVar.c = this.f998g;
        return dVar;
    }
}
