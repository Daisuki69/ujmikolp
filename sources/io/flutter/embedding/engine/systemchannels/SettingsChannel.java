package io.flutter.embedding.engine.systemchannels;

import android.annotation.SuppressLint;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import androidx.annotation.VisibleForTesting;
import io.flutter.embedding.engine.dart.DartExecutor;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;
import pg.C2042e;
import pg.InterfaceC2041d;
import pg.o;

/* JADX INFO: loaded from: classes4.dex */
public class SettingsChannel {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String ALWAYS_USE_24_HOUR_FORMAT = "alwaysUse24HourFormat";
    private static final String BRIEFLY_SHOW_PASSWORD = "brieflyShowPassword";
    public static final String CHANNEL_NAME = "flutter/settings";
    private static final String CONFIGURATION_ID = "configurationId";
    private static final ConfigurationQueue CONFIGURATION_QUEUE = new ConfigurationQueue();
    private static final String NATIVE_SPELL_CHECK_SERVICE_DEFINED = "nativeSpellCheckServiceDefined";
    private static final String PLATFORM_BRIGHTNESS = "platformBrightness";
    private static final String TAG = "SettingsChannel";
    private static final String TEXT_SCALE_FACTOR = "textScaleFactor";

    @NonNull
    public final C2042e channel;

    @VisibleForTesting
    public static class ConfigurationQueue {
        private SentConfiguration currentConfiguration;
        private SentConfiguration previousEnqueuedConfiguration;
        private final ConcurrentLinkedQueue<SentConfiguration> sentQueue = new ConcurrentLinkedQueue<>();

        public static class SentConfiguration {
            private static int nextConfigGeneration = Integer.MIN_VALUE;

            @NonNull
            private final DisplayMetrics displayMetrics;

            @NonNull
            public final int generationNumber;

            public SentConfiguration(@NonNull DisplayMetrics displayMetrics) {
                int i = nextConfigGeneration;
                nextConfigGeneration = i + 1;
                this.generationNumber = i;
                this.displayMetrics = displayMetrics;
            }
        }

        @Nullable
        @UiThread
        public InterfaceC2041d enqueueConfiguration(SentConfiguration sentConfiguration) {
            this.sentQueue.add(sentConfiguration);
            final SentConfiguration sentConfiguration2 = this.previousEnqueuedConfiguration;
            this.previousEnqueuedConfiguration = sentConfiguration;
            if (sentConfiguration2 == null) {
                return null;
            }
            return new InterfaceC2041d() { // from class: io.flutter.embedding.engine.systemchannels.SettingsChannel.ConfigurationQueue.1
                @Override // pg.InterfaceC2041d
                @UiThread
                public void reply(Object obj) {
                    ConfigurationQueue.this.sentQueue.remove(sentConfiguration2);
                    if (ConfigurationQueue.this.sentQueue.isEmpty()) {
                        return;
                    }
                    Log.e(SettingsChannel.TAG, "The queue becomes empty after removing config generation " + String.valueOf(sentConfiguration2.generationNumber));
                }
            };
        }

        public SentConfiguration getConfiguration(int i) {
            SentConfiguration sentConfiguration;
            if (this.currentConfiguration == null) {
                this.currentConfiguration = this.sentQueue.poll();
            }
            while (true) {
                sentConfiguration = this.currentConfiguration;
                if (sentConfiguration == null || sentConfiguration.generationNumber >= i) {
                    break;
                }
                this.currentConfiguration = this.sentQueue.poll();
            }
            if (sentConfiguration == null) {
                Log.e(SettingsChannel.TAG, "Cannot find config with generation: " + String.valueOf(i) + ", after exhausting the queue.");
                return null;
            }
            if (sentConfiguration.generationNumber == i) {
                return sentConfiguration;
            }
            Log.e(SettingsChannel.TAG, "Cannot find config with generation: " + String.valueOf(i) + ", the oldest config is now: " + String.valueOf(this.currentConfiguration.generationNumber));
            return null;
        }
    }

    public static class MessageBuilder {

        @NonNull
        private final C2042e channel;

        @Nullable
        private DisplayMetrics displayMetrics;

        @NonNull
        private Map<String, Object> message = new HashMap();

        public MessageBuilder(@NonNull C2042e c2042e) {
            this.channel = c2042e;
        }

        public void send() {
            Objects.toString(this.message.get(SettingsChannel.TEXT_SCALE_FACTOR));
            Objects.toString(this.message.get(SettingsChannel.ALWAYS_USE_24_HOUR_FORMAT));
            Objects.toString(this.message.get(SettingsChannel.PLATFORM_BRIGHTNESS));
            DisplayMetrics displayMetrics = this.displayMetrics;
            if (!SettingsChannel.hasNonlinearTextScalingSupport() || displayMetrics == null) {
                this.channel.a(this.message, null);
                return;
            }
            ConfigurationQueue.SentConfiguration sentConfiguration = new ConfigurationQueue.SentConfiguration(displayMetrics);
            InterfaceC2041d interfaceC2041dEnqueueConfiguration = SettingsChannel.CONFIGURATION_QUEUE.enqueueConfiguration(sentConfiguration);
            this.message.put(SettingsChannel.CONFIGURATION_ID, Integer.valueOf(sentConfiguration.generationNumber));
            this.channel.a(this.message, interfaceC2041dEnqueueConfiguration);
        }

        @NonNull
        public MessageBuilder setBrieflyShowPassword(@NonNull boolean z4) {
            this.message.put(SettingsChannel.BRIEFLY_SHOW_PASSWORD, Boolean.valueOf(z4));
            return this;
        }

        @NonNull
        public MessageBuilder setDisplayMetrics(@NonNull DisplayMetrics displayMetrics) {
            this.displayMetrics = displayMetrics;
            return this;
        }

        @NonNull
        public MessageBuilder setNativeSpellCheckServiceDefined(boolean z4) {
            this.message.put(SettingsChannel.NATIVE_SPELL_CHECK_SERVICE_DEFINED, Boolean.valueOf(z4));
            return this;
        }

        @NonNull
        public MessageBuilder setPlatformBrightness(@NonNull PlatformBrightness platformBrightness) {
            this.message.put(SettingsChannel.PLATFORM_BRIGHTNESS, platformBrightness.name);
            return this;
        }

        @NonNull
        public MessageBuilder setTextScaleFactor(float f) {
            this.message.put(SettingsChannel.TEXT_SCALE_FACTOR, Float.valueOf(f));
            return this;
        }

        @NonNull
        public MessageBuilder setUse24HourFormat(boolean z4) {
            this.message.put(SettingsChannel.ALWAYS_USE_24_HOUR_FORMAT, Boolean.valueOf(z4));
            return this;
        }
    }

    public enum PlatformBrightness {
        light("light"),
        dark("dark");


        @NonNull
        public String name;

        PlatformBrightness(@NonNull String str) {
            this.name = str;
        }
    }

    public SettingsChannel(@NonNull DartExecutor dartExecutor) {
        this.channel = new C2042e(dartExecutor, CHANNEL_NAME, o.f19110a, null);
    }

    public static DisplayMetrics getPastDisplayMetrics(int i) {
        ConfigurationQueue.SentConfiguration configuration = CONFIGURATION_QUEUE.getConfiguration(i);
        if (configuration == null) {
            return null;
        }
        return configuration.displayMetrics;
    }

    @SuppressLint({"AnnotateVersionCheck"})
    public static boolean hasNonlinearTextScalingSupport() {
        return Build.VERSION.SDK_INT >= 34;
    }

    @NonNull
    public MessageBuilder startMessage() {
        return new MessageBuilder(this.channel);
    }
}
