install: #Очищаем предыдущую сборку
	./gradlew clean install

run-dist: #Выполняем запуск файла
	./gradlew run

check-updates: #Проверяем обновления зависимостей
	./gradlew dependencyUpdates
