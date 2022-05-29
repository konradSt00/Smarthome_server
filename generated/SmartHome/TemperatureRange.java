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

public enum TemperatureRange implements java.io.Serializable
{
    MIN(0),
    MAX(10);

    public int value()
    {
        return _value;
    }

    public static TemperatureRange valueOf(int v)
    {
        switch(v)
        {
        case 0:
            return MIN;
        case 1:
            return MAX;
        }
        return null;
    }

    private TemperatureRange(int v)
    {
        _value = v;
    }

    public void ice_write(com.zeroc.Ice.OutputStream ostr)
    {
        ostr.writeEnum(_value, 1);
    }

    public static void ice_write(com.zeroc.Ice.OutputStream ostr, TemperatureRange v)
    {
        if(v == null)
        {
            ostr.writeEnum(SmartHome.TemperatureRange.MIN.value(), 1);
        }
        else
        {
            ostr.writeEnum(v.value(), 1);
        }
    }

    public static TemperatureRange ice_read(com.zeroc.Ice.InputStream istr)
    {
        int v = istr.readEnum(1);
        return validate(v);
    }

    public static void ice_write(com.zeroc.Ice.OutputStream ostr, int tag, java.util.Optional<TemperatureRange> v)
    {
        if(v != null && v.isPresent())
        {
            ice_write(ostr, tag, v.get());
        }
    }

    public static void ice_write(com.zeroc.Ice.OutputStream ostr, int tag, TemperatureRange v)
    {
        if(ostr.writeOptional(tag, com.zeroc.Ice.OptionalFormat.Size))
        {
            ice_write(ostr, v);
        }
    }

    public static java.util.Optional<TemperatureRange> ice_read(com.zeroc.Ice.InputStream istr, int tag)
    {
        if(istr.readOptional(tag, com.zeroc.Ice.OptionalFormat.Size))
        {
            return java.util.Optional.of(ice_read(istr));
        }
        else
        {
            return java.util.Optional.empty();
        }
    }

    private static TemperatureRange validate(int v)
    {
        final TemperatureRange e = valueOf(v);
        if(e == null)
        {
            throw new com.zeroc.Ice.MarshalException("enumerator value " + v + " is out of range");
        }
        return e;
    }

    private final int _value;
}