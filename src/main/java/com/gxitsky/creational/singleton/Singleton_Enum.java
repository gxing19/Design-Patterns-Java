package com.gxitsky.creational.singleton;

/**
 * @name: Singleton_Enum
 * @desc: 枚举类实现单例
 * 调用:Singleton_Enum.getInstance(); 或 Singleton_Enum.INSTANCE;
 **/
public enum Singleton_Enum {
    INSTANCE;

    // instance vars, constructor
    private final Connection connection;

    Singleton_Enum() {
        // Initialize the connection
        connection = new Connection();
    }

    // Static getter
    public static Singleton_Enum getInstance() {
        return INSTANCE;
    }

    public Connection getConnection() {
        return connection;
    }
}

