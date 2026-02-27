package mg;

import Ah.h;
import Ah.p;
import Kh.I;
import Nh.j;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import retrofit2.CallAdapter;
import retrofit2.Response;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends CallAdapter.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f18421a;

    public e(j jVar) {
        this.f18421a = jVar;
    }

    @Override // retrofit2.CallAdapter.Factory
    public final CallAdapter get(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        Type parameterUpperBound;
        boolean z4;
        boolean z5;
        Class<?> rawType = CallAdapter.Factory.getRawType(type);
        if (rawType == Ah.a.class) {
            return new d(Void.class, this.f18421a, false, true, false, false, false, true);
        }
        boolean z8 = rawType == Ah.d.class;
        boolean z9 = rawType == p.class;
        boolean z10 = rawType == I.class;
        if (rawType != h.class && !z8 && !z9 && !z10) {
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
        } else if (rawType2 != c.class) {
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
        return new d(parameterUpperBound, this.f18421a, z5, z4, z8, z9, z10, false);
    }
}
