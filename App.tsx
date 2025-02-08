import React, { useEffect } from 'react';
import { SafeAreaView, Text, StyleSheet } from 'react-native';
import SplashScreen from 'react-native-splash-screen';

function App(): React.JSX.Element {


useEffect(() => {
    SplashScreen.hide();
  }, []);
  
  return (
    <SafeAreaView style={styles.container}>
      <Text style={styles.text}>Hello, welcome to your app!</Text>
    </SafeAreaView>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: '#f0f0f0',
  },
  text: {
    fontSize: 18,
    color: '#333',
  },
});

export default App;
