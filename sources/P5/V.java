package P5;

import androidx.media3.exoplayer.rtsp.RtspHeaders;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class V implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5041a;

    public /* synthetic */ V(int i) {
        this.f5041a = i;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        switch (this.f5041a) {
            case 0:
                Request request = chain.request();
                return chain.proceed(request.newBuilder().headers(request.headers().newBuilder().add(RtspHeaders.AUTHORIZATION, "Bearer f95fc5e2940d75e62061d393d47bd2862c3f5de0ef6cbb13c3264f43c8ba5f1c7183ce7462cfdd94799d1ec69d1fa1e1a2c1289426ddf40795aeddc7e6a5d8c73e87666f444ec074116f5e05d87c242582d042f088309e8aa20a423d7f9dd27f110e82131582e124b84a16fe0ab07c0f58048ef5fe515f1bd2d3d9a2da7d1d84").add("x-api-key", "w2uwobrANGZJC77kqQje3Q2ClhmorDyGfByX7z30").build()).method(request.method(), request.body()).build());
            case 1:
                Request request2 = chain.request();
                return chain.proceed(request2.newBuilder().headers(request2.headers().newBuilder().add(RtspHeaders.AUTHORIZATION, "Bearer 102a957b38ccaf3b7a38e990f75941d726378296d8433278cccebecca83ea6b8323de7817d42343808997119b36261aa92246d1addcb5b94de090118b124862b1b6817b97b7b68cb4f347aa920faab6148dd615788ab3fa7bb5e1523faf5f8b80a847bddde72c0a80d4bb0c4b11850e7e62c7f06e1e72ddcebeaac3e8ac5ec84").add("x-api-key", "RVuFFwxT9591jltTzWoEx5uDzpS2EK4da6EMuZIo").build()).method(request2.method(), request2.body()).build());
            case 2:
                Request request3 = chain.request();
                Request requestBuild = request3.newBuilder().headers(request3.headers().newBuilder().add(RtspHeaders.AUTHORIZATION, "Bearer f95fc5e2940d75e62061d393d47bd2862c3f5de0ef6cbb13c3264f43c8ba5f1c7183ce7462cfdd94799d1ec69d1fa1e1a2c1289426ddf40795aeddc7e6a5d8c73e87666f444ec074116f5e05d87c242582d042f088309e8aa20a423d7f9dd27f110e82131582e124b84a16fe0ab07c0f58048ef5fe515f1bd2d3d9a2da7d1d84").build()).method(request3.method(), request3.body()).build();
                yk.a.a();
                return chain.proceed(requestBuild);
            default:
                Request request4 = chain.request();
                Request requestBuild2 = request4.newBuilder().headers(request4.headers().newBuilder().add(RtspHeaders.AUTHORIZATION, "Bearer f95fc5e2940d75e62061d393d47bd2862c3f5de0ef6cbb13c3264f43c8ba5f1c7183ce7462cfdd94799d1ec69d1fa1e1a2c1289426ddf40795aeddc7e6a5d8c73e87666f444ec074116f5e05d87c242582d042f088309e8aa20a423d7f9dd27f110e82131582e124b84a16fe0ab07c0f58048ef5fe515f1bd2d3d9a2da7d1d84").build()).method(request4.method(), request4.body()).build();
                yk.a.a();
                return chain.proceed(requestBuild2);
        }
    }
}
