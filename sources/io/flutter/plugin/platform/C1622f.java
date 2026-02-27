package io.flutter.plugin.platform;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.view.View;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.webkit.internal.AssetHelper;
import io.flutter.embedding.engine.systemchannels.PlatformChannel;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

/* JADX INFO: renamed from: io.flutter.plugin.platform.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1622f implements PlatformChannel.PlatformMessageHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f17224a;

    public C1622f(j jVar) {
        this.f17224a = jVar;
    }

    @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
    public final boolean clipboardHasStrings() {
        ClipDescription primaryClipDescription;
        ClipboardManager clipboardManager = (ClipboardManager) this.f17224a.f17229a.getSystemService("clipboard");
        if (clipboardManager.hasPrimaryClip() && (primaryClipDescription = clipboardManager.getPrimaryClipDescription()) != null) {
            return primaryClipDescription.hasMimeType("text/*");
        }
        return false;
    }

    @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
    public final CharSequence getClipboardData(PlatformChannel.ClipboardContentFormat clipboardContentFormat) {
        Activity activity = this.f17224a.f17229a;
        ClipboardManager clipboardManager = (ClipboardManager) activity.getSystemService("clipboard");
        CharSequence charSequence = null;
        if (clipboardManager.hasPrimaryClip()) {
            try {
                try {
                    ClipData primaryClip = clipboardManager.getPrimaryClip();
                    if (primaryClip != null) {
                        if (clipboardContentFormat != null) {
                            if (clipboardContentFormat == PlatformChannel.ClipboardContentFormat.PLAIN_TEXT) {
                            }
                        }
                        ClipData.Item itemAt = primaryClip.getItemAt(0);
                        CharSequence text = itemAt.getText();
                        if (text != null) {
                            return text;
                        }
                        try {
                            Uri uri = itemAt.getUri();
                            if (uri == null) {
                                Log.w("PlatformPlugin", "Clipboard item contained no textual content nor a URI to retrieve it from.");
                                return null;
                            }
                            String scheme = uri.getScheme();
                            if (!scheme.equals("content")) {
                                Log.w("PlatformPlugin", "Clipboard item contains a Uri with scheme '" + scheme + "'that is unhandled.");
                                return null;
                            }
                            AssetFileDescriptor assetFileDescriptorOpenTypedAssetFileDescriptor = activity.getContentResolver().openTypedAssetFileDescriptor(uri, "text/*", null);
                            CharSequence charSequenceCoerceToText = itemAt.coerceToText(activity);
                            if (assetFileDescriptorOpenTypedAssetFileDescriptor == null) {
                                return charSequenceCoerceToText;
                            }
                            try {
                                assetFileDescriptorOpenTypedAssetFileDescriptor.close();
                                return charSequenceCoerceToText;
                            } catch (IOException e) {
                                charSequence = charSequenceCoerceToText;
                                e = e;
                                Log.w("PlatformPlugin", "Failed to close AssetFileDescriptor while trying to read text from URI.", e);
                                return charSequence;
                            }
                        } catch (IOException e7) {
                            e = e7;
                            charSequence = text;
                        }
                    }
                } catch (IOException e10) {
                    e = e10;
                }
            } catch (FileNotFoundException unused) {
                Log.w("PlatformPlugin", "Clipboard text was unable to be received from content URI.");
                return charSequence;
            } catch (SecurityException e11) {
                Log.w("PlatformPlugin", "Attempted to get clipboard data that requires additional permission(s).\nSee the exception details for which permission(s) are required, and consider adding them to your Android Manifest as described in:\nhttps://developer.android.com/guide/topics/permissions/overview", e11);
                return charSequence;
            }
        }
        return null;
    }

    @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
    public final void playSystemSound(PlatformChannel.SoundType soundType) {
        j jVar = this.f17224a;
        jVar.getClass();
        if (soundType == PlatformChannel.SoundType.CLICK) {
            jVar.f17229a.getWindow().getDecorView().playSoundEffect(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [io.flutter.plugin.platform.i, java.lang.Object] */
    @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
    public final void popSystemNavigator() {
        j jVar = this.f17224a;
        ?? r1 = jVar.c;
        if (r1 == 0 || !r1.popSystemNavigator()) {
            Activity activity = jVar.f17229a;
            if (activity instanceof OnBackPressedDispatcherOwner) {
                ((OnBackPressedDispatcherOwner) activity).getOnBackPressedDispatcher().onBackPressed();
            } else {
                activity.finish();
            }
        }
    }

    @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
    public final void restoreSystemUiOverlays() {
        this.f17224a.b();
    }

    @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
    public final void setApplicationSwitcherDescription(PlatformChannel.AppSwitcherDescription appSwitcherDescription) {
        int i = Build.VERSION.SDK_INT;
        Activity activity = this.f17224a.f17229a;
        if (i < 28) {
            activity.setTaskDescription(new ActivityManager.TaskDescription(appSwitcherDescription.label, (Bitmap) null, appSwitcherDescription.color));
        } else {
            activity.setTaskDescription(AbstractC1621e.b(appSwitcherDescription.color, appSwitcherDescription.label));
        }
    }

    @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
    public final void setClipboardData(String str) {
        ((ClipboardManager) this.f17224a.f17229a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", str));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [io.flutter.plugin.platform.i, java.lang.Object] */
    @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
    public final void setFrameworkHandlesBack(boolean z4) {
        ?? r02 = this.f17224a.c;
        if (r02 != 0) {
            r02.setFrameworkHandlesBack(z4);
        }
    }

    @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
    public final void setPreferredOrientations(int i) {
        this.f17224a.f17229a.setRequestedOrientation(i);
    }

    @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
    public final void setSystemUiChangeListener() {
        j jVar = this.f17224a;
        View decorView = jVar.f17229a.getWindow().getDecorView();
        decorView.setOnSystemUiVisibilityChangeListener(new g(jVar, decorView));
    }

    @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
    public final void setSystemUiOverlayStyle(PlatformChannel.SystemChromeStyle systemChromeStyle) {
        this.f17224a.a(systemChromeStyle);
    }

    @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
    public final void share(String str) {
        j jVar = this.f17224a;
        jVar.getClass();
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType(AssetHelper.DEFAULT_MIME_TYPE);
        intent.putExtra("android.intent.extra.TEXT", str);
        jVar.f17229a.startActivity(Intent.createChooser(intent, null));
    }

    @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
    public final void showSystemOverlays(List list) {
        j jVar = this.f17224a;
        jVar.getClass();
        int i = list.size() == 0 ? 5894 : 1798;
        for (int i4 = 0; i4 < list.size(); i4++) {
            int i6 = h.f17228b[((PlatformChannel.SystemUiOverlay) list.get(i4)).ordinal()];
            if (i6 == 1) {
                i &= -5;
            } else if (i6 == 2) {
                i &= -515;
            }
        }
        jVar.e = i;
        jVar.b();
    }

    @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
    public final void showSystemUiMode(PlatformChannel.SystemUiMode systemUiMode) {
        int i;
        j jVar = this.f17224a;
        jVar.getClass();
        if (systemUiMode == PlatformChannel.SystemUiMode.LEAN_BACK) {
            i = 1798;
        } else if (systemUiMode == PlatformChannel.SystemUiMode.IMMERSIVE) {
            i = 3846;
        } else if (systemUiMode == PlatformChannel.SystemUiMode.IMMERSIVE_STICKY) {
            i = 5894;
        } else if (systemUiMode != PlatformChannel.SystemUiMode.EDGE_TO_EDGE || Build.VERSION.SDK_INT < 29) {
            return;
        } else {
            i = 1792;
        }
        jVar.e = i;
        jVar.b();
    }

    @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
    public final void vibrateHapticFeedback(PlatformChannel.HapticFeedbackType hapticFeedbackType) {
        View decorView = this.f17224a.f17229a.getWindow().getDecorView();
        int i = h.f17227a[hapticFeedbackType.ordinal()];
        if (i == 1) {
            decorView.performHapticFeedback(0);
            return;
        }
        if (i == 2) {
            decorView.performHapticFeedback(1);
            return;
        }
        if (i == 3) {
            decorView.performHapticFeedback(3);
        } else if (i == 4) {
            decorView.performHapticFeedback(6);
        } else {
            if (i != 5) {
                return;
            }
            decorView.performHapticFeedback(4);
        }
    }
}
