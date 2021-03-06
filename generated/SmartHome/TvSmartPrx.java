//
// Copyright (c) ZeroC, Inc. All rights reserved.
//
//
// Ice version 3.7.7
//
// <auto-generated>
//
// Generated from file `SmartHome.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package SmartHome;

public interface TvSmartPrx extends MultimediaDevicePrx
{
    default TvApp[] getApplicationsList()
    {
        return getApplicationsList(com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default TvApp[] getApplicationsList(java.util.Map<String, String> context)
    {
        return _iceI_getApplicationsListAsync(context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<TvApp[]> getApplicationsListAsync()
    {
        return _iceI_getApplicationsListAsync(com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<TvApp[]> getApplicationsListAsync(java.util.Map<String, String> context)
    {
        return _iceI_getApplicationsListAsync(context, false);
    }

    /**
     * @hidden
     * @param context -
     * @param sync -
     * @return -
     **/
    default com.zeroc.IceInternal.OutgoingAsync<TvApp[]> _iceI_getApplicationsListAsync(java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<TvApp[]> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "getApplicationsList", null, sync, null);
        f.invoke(true, context, null, null, istr -> {
                     TvApp[] ret;
                     ret = ApplicationsHelper.read(istr);
                     return ret;
                 });
        return f;
    }

    default Status openApp(String appName)
        throws DeviceTurnedOff,
               NotFound
    {
        return openApp(appName, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default Status openApp(String appName, java.util.Map<String, String> context)
        throws DeviceTurnedOff,
               NotFound
    {
        try
        {
            return _iceI_openAppAsync(appName, context, true).waitForResponseOrUserEx();
        }
        catch(DeviceTurnedOff ex)
        {
            throw ex;
        }
        catch(NotFound ex)
        {
            throw ex;
        }
        catch(com.zeroc.Ice.UserException ex)
        {
            throw new com.zeroc.Ice.UnknownUserException(ex.ice_id(), ex);
        }
    }

    default java.util.concurrent.CompletableFuture<Status> openAppAsync(String appName)
    {
        return _iceI_openAppAsync(appName, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<Status> openAppAsync(String appName, java.util.Map<String, String> context)
    {
        return _iceI_openAppAsync(appName, context, false);
    }

    /**
     * @hidden
     * @param iceP_appName -
     * @param context -
     * @param sync -
     * @return -
     **/
    default com.zeroc.IceInternal.OutgoingAsync<Status> _iceI_openAppAsync(String iceP_appName, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<Status> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "openApp", null, sync, _iceE_openApp);
        f.invoke(true, context, null, ostr -> {
                     ostr.writeString(iceP_appName);
                 }, istr -> {
                     Status ret;
                     ret = Status.ice_read(istr);
                     return ret;
                 });
        return f;
    }

    /** @hidden */
    static final Class<?>[] _iceE_openApp =
    {
        DeviceTurnedOff.class,
        NotFound.class
    };

    default TvApp openedApp()
        throws DeviceTurnedOff
    {
        return openedApp(com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default TvApp openedApp(java.util.Map<String, String> context)
        throws DeviceTurnedOff
    {
        try
        {
            return _iceI_openedAppAsync(context, true).waitForResponseOrUserEx();
        }
        catch(DeviceTurnedOff ex)
        {
            throw ex;
        }
        catch(com.zeroc.Ice.UserException ex)
        {
            throw new com.zeroc.Ice.UnknownUserException(ex.ice_id(), ex);
        }
    }

    default java.util.concurrent.CompletableFuture<TvApp> openedAppAsync()
    {
        return _iceI_openedAppAsync(com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<TvApp> openedAppAsync(java.util.Map<String, String> context)
    {
        return _iceI_openedAppAsync(context, false);
    }

    /**
     * @hidden
     * @param context -
     * @param sync -
     * @return -
     **/
    default com.zeroc.IceInternal.OutgoingAsync<TvApp> _iceI_openedAppAsync(java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<TvApp> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "openedApp", null, sync, _iceE_openedApp);
        f.invoke(true, context, null, null, istr -> {
                     TvApp ret;
                     ret = TvApp.ice_read(istr);
                     return ret;
                 });
        return f;
    }

    /** @hidden */
    static final Class<?>[] _iceE_openedApp =
    {
        DeviceTurnedOff.class
    };

    /**
     * Contacts the remote server to verify that the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param obj The untyped proxy.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    static TvSmartPrx checkedCast(com.zeroc.Ice.ObjectPrx obj)
    {
        return com.zeroc.Ice.ObjectPrx._checkedCast(obj, ice_staticId(), TvSmartPrx.class, _TvSmartPrxI.class);
    }

    /**
     * Contacts the remote server to verify that the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param obj The untyped proxy.
     * @param context The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    static TvSmartPrx checkedCast(com.zeroc.Ice.ObjectPrx obj, java.util.Map<String, String> context)
    {
        return com.zeroc.Ice.ObjectPrx._checkedCast(obj, context, ice_staticId(), TvSmartPrx.class, _TvSmartPrxI.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param obj The untyped proxy.
     * @param facet The name of the desired facet.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    static TvSmartPrx checkedCast(com.zeroc.Ice.ObjectPrx obj, String facet)
    {
        return com.zeroc.Ice.ObjectPrx._checkedCast(obj, facet, ice_staticId(), TvSmartPrx.class, _TvSmartPrxI.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param obj The untyped proxy.
     * @param facet The name of the desired facet.
     * @param context The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    static TvSmartPrx checkedCast(com.zeroc.Ice.ObjectPrx obj, String facet, java.util.Map<String, String> context)
    {
        return com.zeroc.Ice.ObjectPrx._checkedCast(obj, facet, context, ice_staticId(), TvSmartPrx.class, _TvSmartPrxI.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param obj The untyped proxy.
     * @return A proxy for this type.
     **/
    static TvSmartPrx uncheckedCast(com.zeroc.Ice.ObjectPrx obj)
    {
        return com.zeroc.Ice.ObjectPrx._uncheckedCast(obj, TvSmartPrx.class, _TvSmartPrxI.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param obj The untyped proxy.
     * @param facet The name of the desired facet.
     * @return A proxy for this type.
     **/
    static TvSmartPrx uncheckedCast(com.zeroc.Ice.ObjectPrx obj, String facet)
    {
        return com.zeroc.Ice.ObjectPrx._uncheckedCast(obj, facet, TvSmartPrx.class, _TvSmartPrxI.class);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the per-proxy context.
     * @param newContext The context for the new proxy.
     * @return A proxy with the specified per-proxy context.
     **/
    @Override
    default TvSmartPrx ice_context(java.util.Map<String, String> newContext)
    {
        return (TvSmartPrx)_ice_context(newContext);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the adapter ID.
     * @param newAdapterId The adapter ID for the new proxy.
     * @return A proxy with the specified adapter ID.
     **/
    @Override
    default TvSmartPrx ice_adapterId(String newAdapterId)
    {
        return (TvSmartPrx)_ice_adapterId(newAdapterId);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the endpoints.
     * @param newEndpoints The endpoints for the new proxy.
     * @return A proxy with the specified endpoints.
     **/
    @Override
    default TvSmartPrx ice_endpoints(com.zeroc.Ice.Endpoint[] newEndpoints)
    {
        return (TvSmartPrx)_ice_endpoints(newEndpoints);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the locator cache timeout.
     * @param newTimeout The new locator cache timeout (in seconds).
     * @return A proxy with the specified locator cache timeout.
     **/
    @Override
    default TvSmartPrx ice_locatorCacheTimeout(int newTimeout)
    {
        return (TvSmartPrx)_ice_locatorCacheTimeout(newTimeout);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the invocation timeout.
     * @param newTimeout The new invocation timeout (in seconds).
     * @return A proxy with the specified invocation timeout.
     **/
    @Override
    default TvSmartPrx ice_invocationTimeout(int newTimeout)
    {
        return (TvSmartPrx)_ice_invocationTimeout(newTimeout);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for connection caching.
     * @param newCache <code>true</code> if the new proxy should cache connections; <code>false</code> otherwise.
     * @return A proxy with the specified caching policy.
     **/
    @Override
    default TvSmartPrx ice_connectionCached(boolean newCache)
    {
        return (TvSmartPrx)_ice_connectionCached(newCache);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the endpoint selection policy.
     * @param newType The new endpoint selection policy.
     * @return A proxy with the specified endpoint selection policy.
     **/
    @Override
    default TvSmartPrx ice_endpointSelection(com.zeroc.Ice.EndpointSelectionType newType)
    {
        return (TvSmartPrx)_ice_endpointSelection(newType);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for how it selects endpoints.
     * @param b If <code>b</code> is <code>true</code>, only endpoints that use a secure transport are
     * used by the new proxy. If <code>b</code> is false, the returned proxy uses both secure and
     * insecure endpoints.
     * @return A proxy with the specified selection policy.
     **/
    @Override
    default TvSmartPrx ice_secure(boolean b)
    {
        return (TvSmartPrx)_ice_secure(b);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the encoding used to marshal parameters.
     * @param e The encoding version to use to marshal request parameters.
     * @return A proxy with the specified encoding version.
     **/
    @Override
    default TvSmartPrx ice_encodingVersion(com.zeroc.Ice.EncodingVersion e)
    {
        return (TvSmartPrx)_ice_encodingVersion(e);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for its endpoint selection policy.
     * @param b If <code>b</code> is <code>true</code>, the new proxy will use secure endpoints for invocations
     * and only use insecure endpoints if an invocation cannot be made via secure endpoints. If <code>b</code> is
     * <code>false</code>, the proxy prefers insecure endpoints to secure ones.
     * @return A proxy with the specified selection policy.
     **/
    @Override
    default TvSmartPrx ice_preferSecure(boolean b)
    {
        return (TvSmartPrx)_ice_preferSecure(b);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the router.
     * @param router The router for the new proxy.
     * @return A proxy with the specified router.
     **/
    @Override
    default TvSmartPrx ice_router(com.zeroc.Ice.RouterPrx router)
    {
        return (TvSmartPrx)_ice_router(router);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the locator.
     * @param locator The locator for the new proxy.
     * @return A proxy with the specified locator.
     **/
    @Override
    default TvSmartPrx ice_locator(com.zeroc.Ice.LocatorPrx locator)
    {
        return (TvSmartPrx)_ice_locator(locator);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for collocation optimization.
     * @param b <code>true</code> if the new proxy enables collocation optimization; <code>false</code> otherwise.
     * @return A proxy with the specified collocation optimization.
     **/
    @Override
    default TvSmartPrx ice_collocationOptimized(boolean b)
    {
        return (TvSmartPrx)_ice_collocationOptimized(b);
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses twoway invocations.
     * @return A proxy that uses twoway invocations.
     **/
    @Override
    default TvSmartPrx ice_twoway()
    {
        return (TvSmartPrx)_ice_twoway();
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses oneway invocations.
     * @return A proxy that uses oneway invocations.
     **/
    @Override
    default TvSmartPrx ice_oneway()
    {
        return (TvSmartPrx)_ice_oneway();
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses batch oneway invocations.
     * @return A proxy that uses batch oneway invocations.
     **/
    @Override
    default TvSmartPrx ice_batchOneway()
    {
        return (TvSmartPrx)_ice_batchOneway();
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses datagram invocations.
     * @return A proxy that uses datagram invocations.
     **/
    @Override
    default TvSmartPrx ice_datagram()
    {
        return (TvSmartPrx)_ice_datagram();
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses batch datagram invocations.
     * @return A proxy that uses batch datagram invocations.
     **/
    @Override
    default TvSmartPrx ice_batchDatagram()
    {
        return (TvSmartPrx)_ice_batchDatagram();
    }

    /**
     * Returns a proxy that is identical to this proxy, except for compression.
     * @param co <code>true</code> enables compression for the new proxy; <code>false</code> disables compression.
     * @return A proxy with the specified compression setting.
     **/
    @Override
    default TvSmartPrx ice_compress(boolean co)
    {
        return (TvSmartPrx)_ice_compress(co);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for its connection timeout setting.
     * @param t The connection timeout for the proxy in milliseconds.
     * @return A proxy with the specified timeout.
     **/
    @Override
    default TvSmartPrx ice_timeout(int t)
    {
        return (TvSmartPrx)_ice_timeout(t);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for its connection ID.
     * @param connectionId The connection ID for the new proxy. An empty string removes the connection ID.
     * @return A proxy with the specified connection ID.
     **/
    @Override
    default TvSmartPrx ice_connectionId(String connectionId)
    {
        return (TvSmartPrx)_ice_connectionId(connectionId);
    }

    /**
     * Returns a proxy that is identical to this proxy, except it's a fixed proxy bound
     * the given connection.@param connection The fixed proxy connection.
     * @return A fixed proxy bound to the given connection.
     **/
    @Override
    default TvSmartPrx ice_fixed(com.zeroc.Ice.Connection connection)
    {
        return (TvSmartPrx)_ice_fixed(connection);
    }

    static String ice_staticId()
    {
        return "::SmartHome::TvSmart";
    }
}
