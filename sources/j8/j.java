package J8;

import D.CallableC0168a;
import Kh.J;
import N5.n1;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import cj.C1112C;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.domain.model.KycFileContent;
import com.paymaya.domain.model.KycOcrId;
import com.paymaya.domain.model.KycPart;
import java.util.List;
import o1.AbstractC1955a;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f2471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f2472b;
    public final boolean c;

    public j(List idThumbnails, List idThumbnailsV2, boolean z4, int i) {
        idThumbnails = (i & 1) != 0 ? C1112C.f9377a : idThumbnails;
        idThumbnailsV2 = (i & 2) != 0 ? C1112C.f9377a : idThumbnailsV2;
        kotlin.jvm.internal.j.g(idThumbnails, "idThumbnails");
        kotlin.jvm.internal.j.g(idThumbnailsV2, "idThumbnailsV2");
        this.f2471a = idThumbnails;
        this.f2472b = idThumbnailsV2;
        this.c = z4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.c ? this.f2472b.size() : this.f2471a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        String base64;
        N8.c holder = (N8.c) viewHolder;
        kotlin.jvm.internal.j.g(holder, "holder");
        KycFileContent file = this.c ? ((KycPart) this.f2472b.get(i)).getFile() : ((KycOcrId) this.f2471a.get(i)).getFile();
        n1 n1Var = holder.f4332a;
        if (file == null || (base64 = file.getBase64()) == null || C2576A.H(base64)) {
            AbstractC1955a.w(n1Var.c, file != null ? file.getS3Url() : null, false);
            return;
        }
        ImageView imageView = n1Var.c;
        if (C2576A.H(base64)) {
            imageView.setImageResource(2131231490);
            return;
        }
        imageView.setImageResource(2131231490);
        Object tag = imageView.getTag(R.id.image_load_disposable);
        io.reactivex.rxjava3.disposables.b bVar = tag instanceof io.reactivex.rxjava3.disposables.b ? (io.reactivex.rxjava3.disposables.b) tag : null;
        if (bVar != null) {
            bVar.dispose();
        }
        Object bVar2 = new F8.b(imageView, 0);
        imageView.setTag(R.id.image_load_target, bVar2);
        Lh.h hVarH = new J(new CallableC0168a(base64, 5), 3).h(Th.e.c);
        Ah.o oVarA = zh.b.a();
        Gh.d dVar = new Gh.d(1, new J5.c(bVar2, 23), new V2.c(bVar2, 22));
        try {
            hVarH.f(new Lh.g(dVar, oVarA));
            imageView.setTag(R.id.image_load_disposable, dVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th2) {
            throw AbstractC1213b.L(th2, "subscribeActual failed", th2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        kotlin.jvm.internal.j.g(parent, "parent");
        return new N8.c(n1.a(x3.d.p(parent), parent));
    }
}
