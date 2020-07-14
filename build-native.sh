#!/bin/sh

native-image --no-server --no-fallback -jar target/redisson-native-image-test-1.0-SNAPSHOT.jar target/app
