package Z;

import android.util.Pair;
import androidx.constraintlayout.core.state.Interpolator;
import androidx.constraintlayout.core.state.Transition;
import com.google.gson.JsonIOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class m implements Interpolator, com.google.gson.internal.l, Ch.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f6842b;

    public /* synthetic */ m(String str, int i) {
        this.f6841a = i;
        this.f6842b = str;
    }

    @Override // Ch.f
    public Object apply(Object obj) {
        switch (this.f6841a) {
            case 8:
                Map map = (Map) obj;
                String str = this.f6842b;
                if (!map.containsKey(str)) {
                }
                break;
        }
        return Ah.p.c(new Pair((List) obj, this.f6842b));
    }

    @Override // com.google.gson.internal.l
    public Object b() {
        switch (this.f6841a) {
            case 2:
                throw new JsonIOException(this.f6842b);
            case 3:
                throw new JsonIOException(this.f6842b);
            case 4:
                throw new JsonIOException(this.f6842b);
            default:
                throw new JsonIOException(this.f6842b);
        }
    }

    @Override // androidx.constraintlayout.core.state.Interpolator
    public float getInterpolation(float f) {
        return Transition.lambda$getInterpolator$0(this.f6842b, f);
    }
}
