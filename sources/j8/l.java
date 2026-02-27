package J8;

import N5.n1;
import We.A;
import We.G;
import android.net.Uri;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f2476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f2477b;

    public l(ArrayList arrayList, File file) {
        this.f2476a = arrayList;
        this.f2477b = file;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f2476a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        N8.c holder = (N8.c) viewHolder;
        kotlin.jvm.internal.j.g(holder, "holder");
        String fileName = (String) this.f2476a.get(i);
        kotlin.jvm.internal.j.g(fileName, "fileName");
        File applicationDirectory = this.f2477b;
        kotlin.jvm.internal.j.g(applicationDirectory, "applicationDirectory");
        String path = applicationDirectory.getPath();
        String str = File.separator;
        File file = new File(path + str + "kycids" + str + fileName + ".jpg");
        if (!file.exists()) {
            file = null;
        }
        ImageView imageView = holder.f4332a.c;
        if (file == null || !file.exists()) {
            imageView.setImageResource(2131231490);
            return;
        }
        A aD = A.d();
        aD.getClass();
        G g8 = aD.g(Uri.fromFile(file));
        g8.h(2131231490);
        g8.b(2131231490);
        g8.f(2);
        g8.e(imageView, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        kotlin.jvm.internal.j.g(parent, "parent");
        return new N8.c(n1.a(x3.d.p(parent), parent));
    }
}
