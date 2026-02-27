package retrofit2.adapter.rxjava2;

import ch.AbstractC1103b;
import ch.AbstractC1107f;
import ch.AbstractC1109h;
import ch.l;
import ch.v;
import ch.w;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import retrofit2.CallAdapter;
import retrofit2.Response;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes5.dex */
public final class RxJava2CallAdapterFactory extends CallAdapter.Factory {
    private final boolean isAsync;
    private final v scheduler;

    private RxJava2CallAdapterFactory(v vVar, boolean z4) {
        this.scheduler = vVar;
        this.isAsync = z4;
    }

    public static RxJava2CallAdapterFactory create() {
        return new RxJava2CallAdapterFactory(null, false);
    }

    public static RxJava2CallAdapterFactory createAsync() {
        return new RxJava2CallAdapterFactory(null, true);
    }

    public static RxJava2CallAdapterFactory createWithScheduler(v vVar) {
        if (vVar != null) {
            return new RxJava2CallAdapterFactory(vVar, false);
        }
        throw new NullPointerException("scheduler == null");
    }

    @Override // retrofit2.CallAdapter.Factory
    public CallAdapter<?, ?> get(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        Type parameterUpperBound;
        boolean z4;
        boolean z5;
        Class<?> rawType = CallAdapter.Factory.getRawType(type);
        if (rawType == AbstractC1103b.class) {
            return new RxJava2CallAdapter(Void.class, this.scheduler, this.isAsync, false, true, false, false, false, true);
        }
        boolean z8 = rawType == AbstractC1107f.class;
        boolean z9 = rawType == w.class;
        boolean z10 = rawType == AbstractC1109h.class;
        if (rawType != l.class && !z8 && !z9 && !z10) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            String str = !z8 ? !z9 ? z10 ? "Maybe" : "Observable" : "Single" : "Flowable";
            throw new IllegalStateException(str + " return type must be parameterized as " + str + "<Foo> or " + str + "<? extends Foo>");
        }
        Type parameterUpperBound2 = CallAdapter.Factory.getParameterUpperBound(0, (ParameterizedType) type);
        Class<?> rawType2 = CallAdapter.Factory.getRawType(parameterUpperBound2);
        if (rawType2 == Response.class) {
            if (!(parameterUpperBound2 instanceof ParameterizedType)) {
                throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
            }
            parameterUpperBound = CallAdapter.Factory.getParameterUpperBound(0, (ParameterizedType) parameterUpperBound2);
            z5 = false;
            z4 = false;
        } else if (rawType2 != Result.class) {
            parameterUpperBound = parameterUpperBound2;
            z4 = true;
            z5 = false;
        } else {
            if (!(parameterUpperBound2 instanceof ParameterizedType)) {
                throw new IllegalStateException("Result must be parameterized as Result<Foo> or Result<? extends Foo>");
            }
            parameterUpperBound = CallAdapter.Factory.getParameterUpperBound(0, (ParameterizedType) parameterUpperBound2);
            z5 = true;
            z4 = false;
        }
        return new RxJava2CallAdapter(parameterUpperBound, this.scheduler, this.isAsync, z5, z4, z8, z9, z10, false);
    }
}
