## HashMap 클래스에서 제공하는 메소드

- put(K key, V value) : 키와 값을 HashMap에 추가합니다. 만약 같은 키로 이미 값이 존재한다면, 기존 값을 새 값으로 덮어씌웁니다.

- getOrDefault(Object key, V defaultValue)
  주어진 키에 대응하는 값을 반환하며, 해당 키가 존재하지 않으면 기본값(defaultValue)을 반환합니다.

- keySet() : HashMap에 있는 모든 키를 하나의 Set 으로 반환한다.
이 Set은 중복되지 않는 값을 저장하는 컬렉션으로, HashMap의 모든 키들을 순회하거나 다른 작업을 수행할 수 있게 한다.


- size() : 현재 HashMap에 들어있는 key의 개수를 반환한다.

