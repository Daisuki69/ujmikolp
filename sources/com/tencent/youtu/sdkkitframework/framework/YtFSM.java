package com.tencent.youtu.sdkkitframework.framework;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.dynatrace.android.agent.Global;
import com.tencent.youtu.sdkkitframework.common.BytesPoolHelper;
import com.tencent.youtu.sdkkitframework.common.CommonUtils;
import com.tencent.youtu.sdkkitframework.common.ErrorCode;
import com.tencent.youtu.sdkkitframework.common.OperateInfoManager;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import com.tencent.youtu.sdkkitframework.common.StringCode;
import com.tencent.youtu.sdkkitframework.common.YTImageData;
import com.tencent.youtu.sdkkitframework.common.YtLogger;
import com.tencent.youtu.sdkkitframework.common.YtSDKStats;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class YtFSM {
    public static final String TAG = "YtFSM";
    public static YtFSM instance;
    public YTImageData currentImageData;
    public YtFSMBaseState currentState;
    public YtSDKKitFramework.IYtSDKKitFrameworkEventListener eventListener;
    public String firstStateName;
    public YtSDKKitFramework.YtSDKPlatformContext sdkPlatformContex;
    public Thread updateEventHandler;
    public YtSDKKitFramework.YtSDKKitFrameworkWorkMode currentWorkMode = YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_UNKNOWN;
    public boolean isStarted = false;
    public boolean needEventHandler = false;
    public YtFSMUpdateStrategy currentStrategy = YtFSMUpdateStrategy.CacheStrategy;
    public long feedTimeMs = 0;
    public boolean checkUpdateTimerFlag = true;
    public Map<String, YtFSMBaseState> stateMap = new ConcurrentHashMap();
    public Lock stateLock = new ReentrantLock();
    public Lock startStopLock = new ReentrantLock();
    public ConcurrentLinkedQueue<YtFSMUpdateData> updateQueue = new ConcurrentLinkedQueue<>();
    public ConcurrentLinkedQueue<Object> eventQueue = new ConcurrentLinkedQueue<>();

    public class YtFSMFireEventData {
        public YtSDKKitFramework.YtFrameworkFireEventType eventType;
        public Object extraData;

        public YtFSMFireEventData(YtSDKKitFramework.YtFrameworkFireEventType ytFrameworkFireEventType, Object obj) {
            this.eventType = ytFrameworkFireEventType;
            this.extraData = obj;
        }
    }

    public class YtFSMUpdateData {
        public byte[] imageData;
        public int imageHeight;
        public int imageWidth;
        public long timeStamp;

        public YtFSMUpdateData() {
        }

        public void mirror() {
            int i;
            int i4 = 0;
            int i6 = 0;
            while (true) {
                i = this.imageHeight;
                if (i6 >= i) {
                    break;
                }
                int i10 = this.imageWidth;
                int i11 = i6 * i10;
                i6++;
                for (int i12 = (i10 * i6) - 1; i11 < i12; i12--) {
                    byte[] bArr = this.imageData;
                    byte b8 = bArr[i11];
                    bArr[i11] = bArr[i12];
                    bArr[i12] = b8;
                    i11++;
                }
            }
            int i13 = this.imageWidth * i;
            while (i4 < this.imageHeight / 2) {
                int i14 = this.imageWidth;
                int i15 = i4 * i14;
                i4++;
                for (int i16 = (i14 * i4) - 2; i15 < i16; i16 -= 2) {
                    byte[] bArr2 = this.imageData;
                    int i17 = i15 + i13;
                    byte b10 = bArr2[i17];
                    int i18 = i16 + i13;
                    bArr2[i17] = bArr2[i18];
                    bArr2[i18] = b10;
                    int i19 = i17 + 1;
                    byte b11 = bArr2[i19];
                    int i20 = i18 + 1;
                    bArr2[i19] = bArr2[i20];
                    bArr2[i20] = b11;
                    i15 += 2;
                }
            }
        }
    }

    public enum YtFSMUpdateStrategy {
        CacheStrategy,
        NoCacheStrategy
    }

    public YtFSM() {
        BytesPoolHelper.getInstance().recycleAll();
    }

    public static synchronized void clearInstance() {
        if (instance != null) {
            instance = null;
        }
    }

    public static synchronized YtFSM getInstance() {
        try {
            if (instance == null) {
                instance = new YtFSM();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return instance;
    }

    public void cleanUpQueue() {
        this.updateQueue.clear();
    }

    public YtSDKKitFramework.YtSDKPlatformContext getContext() {
        if (this.sdkPlatformContex == null) {
            this.sdkPlatformContex = new YtSDKKitFramework.YtSDKPlatformContext();
        }
        return this.sdkPlatformContex;
    }

    public YtFSMBaseState getStateByName(String str) {
        if (this.stateMap.containsKey(str)) {
            return this.stateMap.get(str);
        }
        return null;
    }

    public YtSDKKitFramework.YtSDKKitFrameworkWorkMode getWorkMode() {
        return this.currentWorkMode;
    }

    public void handleEvent(YtSDKKitFramework.YtFrameworkFireEventType ytFrameworkFireEventType, Object obj) {
        try {
            this.eventQueue.add(new YtFSMFireEventData(ytFrameworkFireEventType, obj));
        } catch (Exception e) {
            OperateInfoManager.getInstance().setCatchErrorData(Log.getStackTraceString(e));
            YtLogger.e(TAG, "Handle event failed:", e);
        }
    }

    public void handlePauseEvent() {
        Iterator<YtFSMBaseState> it = this.stateMap.values().iterator();
        while (it.hasNext()) {
            it.next().onPause();
        }
    }

    public void handleResumeEvent() {
        Iterator<YtFSMBaseState> it = this.stateMap.values().iterator();
        while (it.hasNext()) {
            it.next().onResume();
        }
    }

    public int registerState(YtFSMBaseState ytFSMBaseState) {
        YtSDKStats.getInstance().registerStateName(ytFSMBaseState.getStateSimpleName());
        this.stateMap.put(ytFSMBaseState.getStateName(), ytFSMBaseState);
        return 0;
    }

    public void reset() {
        YtLogger.i(TAG, "FSM reset work mode " + this.currentWorkMode);
        try {
            this.eventQueue.add("reset");
        } catch (Exception e) {
            OperateInfoManager.getInstance().setCatchErrorData(Log.getStackTraceString(e));
            YtLogger.e(TAG, "handle reset failed:", e);
        }
    }

    public void sendFSMEvent(HashMap<String, Object> map) {
        if (this.eventListener == null) {
            YtLogger.e(TAG, "Event listener not init", null);
            return;
        }
        if (map.containsKey(StateEvent.Name.PROCESS_RESULT)) {
            String strMakePackUseTime = OperateInfoManager.getInstance().makePackUseTime();
            String strMakeCatchErrorData = OperateInfoManager.getInstance().makeCatchErrorData();
            if (!TextUtils.isEmpty(strMakePackUseTime)) {
                YtLogger.d("OPERATE", "FSM EVENT:" + strMakePackUseTime + Global.NEWLINE + strMakeCatchErrorData);
                map.put(StateEvent.Name.OPERATE_CATCH_ERROR, strMakeCatchErrorData);
                map.put(StateEvent.Name.OPERATE_PACK_USE_TIME, strMakePackUseTime);
            }
            YtLogger.d(TAG, "send framework event result: " + map.get(StateEvent.Name.PROCESS_RESULT) + " errorcode:" + map.get(StateEvent.Name.ERROR_CODE));
        }
        YtLogger.d(TAG, "eventDict=" + map);
        this.eventListener.onFrameworkEvent(map);
    }

    public void sendNetworkRequest(String str, String str2, String str3, HashMap<String, String> map, YtSDKKitFramework.IYtSDKKitNetResponseParser iYtSDKKitNetResponseParser) {
        if (this.eventListener == null) {
            YtLogger.e(TAG, "Event listener not init", null);
        } else {
            sendFSMEvent(new HashMap<String, Object>(str) { // from class: com.tencent.youtu.sdkkitframework.framework.YtFSM.2
                public final /* synthetic */ String val$netType;

                {
                    this.val$netType = str;
                    String strMakePackUseTime = OperateInfoManager.getInstance().makePackUseTime();
                    String strMakeCatchErrorData = OperateInfoManager.getInstance().makeCatchErrorData();
                    if (!TextUtils.isEmpty(strMakePackUseTime)) {
                        YtLogger.d("OPERATE", "NETWORK EVENT:" + strMakePackUseTime + Global.NEWLINE + strMakeCatchErrorData);
                        put(StateEvent.Name.OPERATE_CATCH_ERROR, strMakeCatchErrorData);
                        put(StateEvent.Name.OPERATE_PACK_USE_TIME, strMakePackUseTime);
                    }
                    put(StateEvent.Name.UI_TIPS, str);
                }
            });
            this.eventListener.onNetworkRequestEvent(str2, str3, map, iYtSDKKitNetResponseParser);
        }
    }

    public void setContext(YtSDKKitFramework.YtSDKPlatformContext ytSDKPlatformContext) {
        this.sdkPlatformContex = ytSDKPlatformContext;
    }

    public void setEventListener(YtSDKKitFramework.IYtSDKKitFrameworkEventListener iYtSDKKitFrameworkEventListener) {
        this.eventListener = iYtSDKKitFrameworkEventListener;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void start(String str, YtSDKKitFramework.YtSDKKitFrameworkWorkMode ytSDKKitFrameworkWorkMode, final int i, final long j, final int i4, final int i6) throws Throwable {
        YtFSM ytFSM;
        Throwable th2;
        YtFSM ytFSM2;
        Exception exc;
        Object obj = "start set current state:";
        String str2 = TAG;
        YtLogger.i(str2, "FSM start use work mode " + ytSDKKitFrameworkWorkMode);
        try {
            try {
                this.startStopLock.lock();
                if (this.isStarted) {
                    ytFSM = this;
                } else {
                    this.firstStateName = str;
                    this.currentWorkMode = ytSDKKitFrameworkWorkMode;
                    this.isStarted = true;
                    this.needEventHandler = true;
                    this.checkUpdateTimerFlag = true;
                    if (this.stateMap.containsKey(str)) {
                        try {
                            YtLogger.d(str2, "start set current state:" + str);
                            YtFSMBaseState ytFSMBaseState = this.stateMap.get(this.firstStateName);
                            this.currentState = ytFSMBaseState;
                            ytFSMBaseState.enter();
                        } catch (Exception e) {
                            exc = e;
                            ytFSM = this;
                            YtLogger.e(TAG, "FSM error", exc);
                            OperateInfoManager.getInstance().setCatchErrorData(Log.getStackTraceString(exc));
                            ytFSM.startStopLock.unlock();
                            return;
                        } catch (Throwable th3) {
                            th2 = th3;
                            ytFSM2 = this;
                            ytFSM2.startStopLock.unlock();
                            throw th2;
                        }
                    } else {
                        YtLogger.e(str2, "Start " + str + " failed which is not found", null);
                    }
                    this.updateQueue.clear();
                    ytFSM = this;
                    try {
                        Thread thread = new Thread(new Runnable() { // from class: com.tencent.youtu.sdkkitframework.framework.YtFSM.1
                            @Override // java.lang.Runnable
                            public void run() {
                                YtFSMUpdateData ytFSMUpdateData;
                                Process.setThreadPriority(i);
                                while (YtFSM.this.needEventHandler) {
                                    if (YtFSM.this.isStarted) {
                                        while (true) {
                                            ytFSMUpdateData = null;
                                            if (YtFSM.this.eventQueue.isEmpty()) {
                                                try {
                                                    break;
                                                } catch (Throwable th4) {
                                                    YtFSM.this.stateLock.unlock();
                                                    throw th4;
                                                }
                                            }
                                            Object objPoll = YtFSM.this.eventQueue.poll();
                                            if (objPoll instanceof String) {
                                                if (((String) objPoll).equals("reset")) {
                                                    Iterator it = YtFSM.this.stateMap.values().iterator();
                                                    while (it.hasNext()) {
                                                        ((YtFSMBaseState) it.next()).reset();
                                                    }
                                                    if (YtFSM.this.stateMap.containsKey(YtFSM.this.firstStateName)) {
                                                        YtLogger.d(YtFSM.TAG, "reset set current state:" + YtFSM.this.firstStateName);
                                                        YtFSM ytFSM3 = YtFSM.this;
                                                        ytFSM3.currentState = (YtFSMBaseState) ytFSM3.stateMap.get(YtFSM.this.firstStateName);
                                                        YtFSM.this.currentState.enter();
                                                    } else {
                                                        YtLogger.e(YtFSM.TAG, "reset failed: " + YtFSM.this.firstStateName + " state is not found", null);
                                                    }
                                                    YtFSM.this.updateQueue.clear();
                                                    YtFSM.this.checkUpdateTimerFlag = true;
                                                }
                                            } else if (objPoll instanceof YtFSMFireEventData) {
                                                YtFSMFireEventData ytFSMFireEventData = (YtFSMFireEventData) objPoll;
                                                YtLogger.d(YtFSM.TAG, "handleevent " + ytFSMFireEventData.eventType + " for all states");
                                                Iterator it2 = YtFSM.this.stateMap.values().iterator();
                                                while (it2.hasNext()) {
                                                    ((YtFSMBaseState) it2.next()).handleEvent(ytFSMFireEventData.eventType, ytFSMFireEventData.extraData);
                                                }
                                            }
                                        }
                                        YtFSM.this.stateLock.lock();
                                        if (YtFSM.this.currentStrategy == YtFSMUpdateStrategy.CacheStrategy) {
                                            ytFSMUpdateData = (YtFSMUpdateData) YtFSM.this.updateQueue.poll();
                                        } else if (YtFSM.this.currentStrategy == YtFSMUpdateStrategy.NoCacheStrategy) {
                                            YtLogger.i(YtFSM.TAG, "no cache str size:" + YtFSM.this.updateQueue.size());
                                            while (YtFSM.this.updateQueue.size() > 0) {
                                                ytFSMUpdateData = (YtFSMUpdateData) YtFSM.this.updateQueue.poll();
                                            }
                                        } else {
                                            YtLogger.e(YtFSM.TAG, "unknown strategy " + YtFSM.this.currentStrategy, null);
                                        }
                                        if (ytFSMUpdateData != null) {
                                            if (i4 == 1) {
                                                ytFSMUpdateData.mirror();
                                            }
                                            int i10 = i4;
                                            YtFSM.this.currentImageData = YtSDKKitFrameworkTool.yuvRotateAnd2bgrImge(ytFSMUpdateData.imageData, i10 == 0 ? ytFSMUpdateData.imageWidth : ytFSMUpdateData.imageHeight, i10 == 0 ? ytFSMUpdateData.imageHeight : ytFSMUpdateData.imageWidth, YtFSM.getInstance().getContext().currentRotateState, i6);
                                            YtFSM.this.currentImageData.timeStamp = ytFSMUpdateData.timeStamp;
                                            BytesPoolHelper.getInstance().release(ytFSMUpdateData.imageData);
                                            if (YtFSM.this.currentState != null) {
                                                YtFSM.this.currentState.update(YtFSM.this.currentImageData, YtFSM.this.currentImageData.timeStamp);
                                            }
                                        }
                                        YtFSM.this.stateLock.unlock();
                                    }
                                    try {
                                        Thread.sleep(2L);
                                    } catch (InterruptedException e7) {
                                        YtLogger.e(YtFSM.TAG, "sleep failed", e7);
                                        OperateInfoManager.getInstance().setCatchErrorData(Log.getStackTraceString(e7));
                                    }
                                    if (YtFSM.this.currentState != null && YtFSM.this.currentState.getStateSimpleName().contains("ReqResult")) {
                                        YtFSM.this.checkUpdateTimerFlag = false;
                                    }
                                    if (YtFSM.this.checkUpdateTimerFlag && YtFSM.this.feedTimeMs > 0 && j > 0 && System.currentTimeMillis() > YtFSM.this.feedTimeMs + j) {
                                        YtFSM.getInstance().sendFSMEvent(new HashMap<String, Object>() { // from class: com.tencent.youtu.sdkkitframework.framework.YtFSM.1.1
                                            {
                                                put(StateEvent.Name.UI_ACTION, StateEvent.ActionValue.PROCESS_FIN);
                                                put(StateEvent.Name.UI_TIPS, StringCode.RST_FAILED);
                                                put(StateEvent.Name.PROCESS_RESULT, StateEvent.ProcessResult.FAILED);
                                                put(StateEvent.Name.ERROR_CODE, Integer.valueOf(ErrorCode.YT_SDK_VERIFY_TIMEOUT));
                                                put("message", CommonUtils.makeMessageJson(ErrorCode.YT_SDK_VERIFY_TIMEOUT, StringCode.MSG_TIMEOUT_ERROR, "Timeout"));
                                            }
                                        });
                                        YtFSM.getInstance().transitNow(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.IDLE_STATE));
                                        return;
                                    }
                                }
                            }
                        });
                        ytFSM.updateEventHandler = thread;
                        thread.setName("YtEventUpdateThread");
                        ytFSM.updateEventHandler.start();
                    } catch (Exception e7) {
                        e = e7;
                        exc = e;
                        YtLogger.e(TAG, "FSM error", exc);
                        OperateInfoManager.getInstance().setCatchErrorData(Log.getStackTraceString(exc));
                        ytFSM.startStopLock.unlock();
                        return;
                    }
                }
                ytFSM.startStopLock.unlock();
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                ytFSM2 = obj;
                ytFSM2.startStopLock.unlock();
                throw th2;
            }
        } catch (Exception e10) {
            e = e10;
            ytFSM = this;
        } catch (Throwable th5) {
            th = th5;
            obj = this;
            th2 = th;
            ytFSM2 = obj;
            ytFSM2.startStopLock.unlock();
            throw th2;
        }
    }

    public void stop() {
        YtLogger.i(TAG, "FSM stop work mode " + this.currentWorkMode);
        try {
            try {
                this.startStopLock.lock();
                this.needEventHandler = false;
                Thread thread = this.updateEventHandler;
                if (thread != null && thread.isAlive()) {
                    this.updateEventHandler.join();
                }
                if (this.isStarted) {
                    this.isStarted = false;
                    Iterator<YtFSMBaseState> it = this.stateMap.values().iterator();
                    while (it.hasNext()) {
                        it.next().unload();
                    }
                    this.stateMap.clear();
                    this.updateQueue.clear();
                }
                this.startStopLock.unlock();
            } catch (InterruptedException e) {
                YtLogger.e(TAG, "FSM strop error", e);
                OperateInfoManager.getInstance().setCatchErrorData(Log.getStackTraceString(e));
                this.startStopLock.unlock();
            }
        } catch (Throwable th2) {
            this.startStopLock.unlock();
            throw th2;
        }
    }

    public int transitNextRound(String str) {
        if (!this.stateMap.containsKey(str)) {
            YtLogger.e(TAG, "transitnextround faild:" + str + " state is not found", null);
            return -1;
        }
        this.currentState.exit();
        YtLogger.d(TAG, "transitnextround set current state:" + str);
        YtFSMBaseState ytFSMBaseState = this.stateMap.get(str);
        this.currentState = ytFSMBaseState;
        if (ytFSMBaseState == null) {
            return -1;
        }
        ytFSMBaseState.enter();
        return 0;
    }

    public int transitNow(String str) {
        if (!this.stateMap.containsKey(str)) {
            YtLogger.e(TAG, "transitnow failed:" + str + " state is not found", null);
            return -1;
        }
        this.currentState.exit();
        YtLogger.d(TAG, "transitnow set current state:" + str);
        YtFSMBaseState ytFSMBaseState = this.stateMap.get(str);
        this.currentState = ytFSMBaseState;
        ytFSMBaseState.enter();
        YTImageData yTImageData = this.currentImageData;
        if (yTImageData != null) {
            this.currentState.update(yTImageData, yTImageData.timeStamp);
        }
        return 0;
    }

    public void update(byte[] bArr, int i, int i4, long j) {
        if (this.isStarted) {
            byte[] bArrAcquire = BytesPoolHelper.getInstance().acquire();
            if (bArrAcquire == null) {
                bArrAcquire = (byte[]) bArr.clone();
            } else {
                BytesPoolHelper.getInstance().copy(bArrAcquire, bArr);
            }
            YtFSMUpdateData ytFSMUpdateData = new YtFSMUpdateData();
            ytFSMUpdateData.imageData = bArrAcquire;
            ytFSMUpdateData.imageWidth = i;
            ytFSMUpdateData.imageHeight = i4;
            ytFSMUpdateData.timeStamp = j;
            if (this.updateQueue.size() >= 10) {
                this.updateQueue.poll();
                YtLogger.d(TAG, "drop frame");
            }
            this.updateQueue.add(ytFSMUpdateData);
            YtLogger.d("FSM_QUEUE", "queue size:" + this.updateQueue.size());
            this.feedTimeMs = System.currentTimeMillis();
        }
    }

    public void updateCacheStrategy(YtFSMUpdateStrategy ytFSMUpdateStrategy) {
        this.currentStrategy = ytFSMUpdateStrategy;
    }

    public void updateSDKSetting(JSONObject jSONObject) {
        Iterator<YtFSMBaseState> it = this.stateMap.values().iterator();
        while (it.hasNext()) {
            it.next().updateSDKSetting(jSONObject);
        }
    }
}
