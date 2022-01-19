install: #Очищаем предыдущую сборку
	./gradlew clean install

run-dist: #Выполняем запуск файла
	./gradlew run

check-updates: #Проверяем обновления зависимостей
	chmod +x ./gradlew
	./gradlew dependencyUpdates

lint: #Проверяем стиль кода
	./gradlew checkstyleMain

build: #Выполняем сборку проекта
	./gradlew clean build
	make lint