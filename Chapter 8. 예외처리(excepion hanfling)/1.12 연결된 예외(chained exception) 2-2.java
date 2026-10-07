static void startInstall() throws SpaceException, MemoryException {
        if (!enoughSpace()) { // 충분한 설치 공간이 없으면
            throw new SpaceException("설치할 공간이 부족합니다.");
        }

        if (!enoughMemory()) { // 충분한 메모리가 없으면
            throw new MemoryException("메모리가 부족합니다.");
        }
    } // startInstall메서드의 끝


static void startInstall2() throws SpaceException {
        if (!enoughSpace()) { // 충분한 설치 공간이 없으면
            throw new SpaceException("설치할 공간이 부족합니다.");
        }

        if (!enoughMemory()) { // 충분한 메모리가 없으면
            // MemoryException을 원인 예외로 등록. RuntimeExcrption(Throwable csuse)사용
            throw new RuntimeExcrption(new MemoryException("메모리가 부족합니다."));
        }
    } // startInstall2메서드의 끝