package io.flutter.plugins.urllauncher;

import android.content.Context;
import android.content.Intent;
import io.flutter.plugins.urllauncher.Messages;
import io.flutter.plugins.urllauncher.UrlLauncher;
import pg.InterfaceC2040c;
import pg.InterfaceC2041d;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements InterfaceC2040c, UrlLauncher.IntentResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17322b;

    public /* synthetic */ a(Object obj, int i) {
        this.f17321a = i;
        this.f17322b = obj;
    }

    @Override // io.flutter.plugins.urllauncher.UrlLauncher.IntentResolver
    public String getHandlerComponentName(Intent intent) {
        return UrlLauncher.lambda$new$0((Context) this.f17322b, intent);
    }

    @Override // pg.InterfaceC2040c
    public void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
        switch (this.f17321a) {
            case 0:
                b.b((Messages.UrlLauncherApi) this.f17322b, obj, interfaceC2041d);
                break;
            case 1:
                b.c((Messages.UrlLauncherApi) this.f17322b, obj, interfaceC2041d);
                break;
            case 2:
                b.d((Messages.UrlLauncherApi) this.f17322b, obj, interfaceC2041d);
                break;
            case 3:
                b.e((Messages.UrlLauncherApi) this.f17322b, obj, interfaceC2041d);
                break;
            default:
                b.f((Messages.UrlLauncherApi) this.f17322b, obj, interfaceC2041d);
                break;
        }
    }
}
