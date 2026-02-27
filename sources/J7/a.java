package J7;

import android.content.Context;
import androidx.core.content.ContextCompat;
import androidx.datastore.DataStoreFile;
import com.google.android.material.color.MaterialColors;
import com.paymaya.R;
import com.paymaya.mayaui.cashin.view.widget.MayaCashInAccountLimitSection;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f2434b;

    public /* synthetic */ a(Context context, int i) {
        this.f2433a = i;
        this.f2434b = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Context context = this.f2434b;
        switch (this.f2433a) {
            case 0:
                return Integer.valueOf(MaterialColors.getColor(context, R.attr.mayaServiceTilesBadgeBackgroundNew, ContextCompat.getColor(context, R.color.maya_additional_purple)));
            case 1:
                return Integer.valueOf(MaterialColors.getColor(context, R.attr.mayaServiceTilesBadgeBackgroundBeta, ContextCompat.getColor(context, R.color.maya_additional_purple)));
            case 2:
                return Integer.valueOf(MaterialColors.getColor(context, R.attr.mayaServiceTilesDynamicStatusBadgeBackgroundColor, ContextCompat.getColor(context, R.color.bittersweet_pink)));
            case 3:
                int i = MayaCashInAccountLimitSection.f;
                return ContextCompat.getDrawable(context, R.drawable.maya_ic_information_primary_badge_light);
            case 4:
                int i4 = MayaCashInAccountLimitSection.f;
                return ContextCompat.getDrawable(context, R.drawable.maya_ic_information_error_badge);
            case 5:
                return DataStoreFile.dataStoreFile(context, "aqs/sessionConfigsDataStore.data");
            default:
                return DataStoreFile.dataStoreFile(context, "aqs/sessionDataStore.data");
        }
    }
}
