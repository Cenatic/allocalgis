package es.satec.localgismobile.fw.net.communications;

import java.io.FileNotFoundException;

import es.satec.localgismobile.fw.net.communications.exceptions.TimeOutException;

public class Runna implements Runnable {

	private Exception _ex;

	private RunnableException _runa;

	private boolean _finish = false;

	private Object _result = null;

	public Runna(RunnableException runa, int time) throws TimeOutException,
			Exception {
		
		int i = 0;
		_runa = runa;
		_ex = null;

		//lanzamos un nuevo hilo que ejecute el metodo Run
//		System.out.println("[Runna.Runna] time->" + time);
		Thread th = new Thread(this, "Runa_" + runa.toString());
//		System.err.println("[Runna.Runna] Antes START Runna");
		th.start();
//		System.err.println("[Runna.Runna] Despu�s START Runna");
		
		//esperamos el tiempo de TIMEOUT antes de hacer Join
		th.join(time * 1000);
//		System.err.println("[Runna.Runna] Despu�s JOIN Runna");

		// while ((i < time) && (!_finish) && (_ex == null)) {
		// try {
		// Thread.sleep (1000);
		// }
		// catch (Exception e) {};
		// i++;
		// }

		if (_ex != null)
			throw _ex;
		else if (!_finish) {
//			System.out.println("[Runna.Runna] _finish: " + _finish
//					+ "; Me salgo por no esperar al plasta este. i:" + i);
			throw new TimeOutException(i);
		}
	}

	//metodo con el cuerpo del hilo que ejecuta internamente el metodo run de la
	//RunnableException pasada como par�metro.
	public void run() {
		try {
			_result = _runa.run();
//			System.out.println("[Runna.run] ha conectado bien-");
		} catch (FileNotFoundException fnfe) {
			_ex = fnfe;
		} catch (Exception e) {
			_ex = e;
			e.printStackTrace();
			//lanzamos la exception para poder controlarla m�s arriba dentro 
			//del m�todo existeConexion
		} finally {
			if (_ex != null){
//				System.err.println("[Runna.run] Pete controlado: "
//						+ _ex.toString());
			}
		}

		_finish = true;
	}

	public Object getResult() {
		return _result;
	}
}
